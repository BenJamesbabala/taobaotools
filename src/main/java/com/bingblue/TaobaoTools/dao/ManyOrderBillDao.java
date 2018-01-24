/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bingblue.TaobaoTools.dao;

import com.bingblue.TaobaoTools.mapper.ManyOrderBillMapper;
import com.bingblue.TaobaoTools.pojo.ManyOrderBill;
import com.bingblue.TaobaoTools.pojo.ManyOrderBillExample;
import com.bingblue.TaobaoTools.pojo.ManyOrderDetail;
import java.util.List;
import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SayMing
 */
@Repository
public class ManyOrderBillDao {

    @Resource
    private ManyOrderDetailDao manyOrderDetailDao;

    @Autowired
    private void setSql(SqlSessionTemplate template) {
        this.sqlSessionTemplate = template;
        this.mapper = this.sqlSessionTemplate.getMapper(ManyOrderBillMapper.class);
    }

    private ManyOrderBillMapper mapper;
    private SqlSessionTemplate sqlSessionTemplate;

    public Integer insert(ManyOrderBill manyOrderBill) {
        return mapper.insert(manyOrderBill);
    }

    public ManyOrderBill selectOneById(Long id, boolean hasDetails) {
        if (hasDetails) {
            return mapper.selectOneHasDetails(id);
        } else {
            return mapper.selectByPrimaryKey(id);
        }
    }

    /**
     * 查找会员下的淘词补单List
     *
     * @param memberId
     * @param hasDetails
     * @param page
     * @param quantity
     * @return
     */
    public List<ManyOrderBill> selectByMemberId(Long memberId, boolean hasDetails, Integer page, Integer quantity) {
        ManyOrderBillExample example = new ManyOrderBillExample();
        example.setStartRow(page);
        example.setPageSize(quantity);
        if (hasDetails) {
            example.createCriteria().andMemberIdEqualTo(memberId);
            List<ManyOrderBill> manyOrderBills = mapper.selectByExample(example);
            for(ManyOrderBill manyOrderBill : manyOrderBills){
                List<ManyOrderDetail> manyOrderDetails = manyOrderDetailDao.selectByHeadId(manyOrderBill.getId());
                manyOrderBill.setManyOrderDetails(manyOrderDetails);
            }
            return manyOrderBills;
        } else {
            example.createCriteria().andMemberIdEqualTo(memberId);
            return mapper.selectByExampleLimit(example);
        }
    }
    
    public long count(Long userId){
        ManyOrderBillExample example = new ManyOrderBillExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return mapper.countByExample(example);
    }
    

}
