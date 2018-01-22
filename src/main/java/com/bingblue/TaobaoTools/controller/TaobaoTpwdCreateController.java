/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bingblue.TaobaoTools.controller;

import com.alibaba.fastjson.JSONObject;
import com.bingblue.TaobaoTools.service.TaobaoTpwdCreateService;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author SayMing
 */
@Controller()
@RequestMapping("/taobao")
public class TaobaoTpwdCreateController {

    private Logger logger = Logger.getLogger(TaobaoTpwdCreateController.class);
    
    @Resource
    private TaobaoTpwdCreateService taobaoTpwdCreateService;

    /**
     * 生成淘口令
     * @param url 链接
     * @param logoUrl 图片链接
     * @param title 分享标题
     * @return 
     */
    @RequestMapping(value = "/tpwd/create", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String createTpwd(String url, String logoUrl, String title) {
        if(url == null || "".equals(url.trim())){
            return Tools.error("待转换的链接不能为空。").toString();
        }
        if(title == null || "".equals(title.trim())){
            return Tools.error("淘口令分享标题不能为空。").toString();
        }
        logger.info("url ===> " + url);
        String tpwd = taobaoTpwdCreateService.create("", logoUrl, url, title, 0L);
        logger.info("tpwd ===> " + tpwd);

        JSONObject result;
        if (tpwd == null) {//失败
            JSONObject object = new JSONObject();
            object.put("Msg", "生成淘口令失败。");
            result = Tools.error(object);
        } else {
            JSONObject object = new JSONObject();
            object.put("Tpwd", tpwd);
            object.put("Url", url);
            result = Tools.success(object);
        }

        return result.toString();
    }

}
