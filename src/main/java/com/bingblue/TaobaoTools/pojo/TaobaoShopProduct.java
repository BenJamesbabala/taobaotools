package com.bingblue.TaobaoTools.pojo;

import java.util.Date;

public class TaobaoShopProduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.p_id
     *
     * @mbg.generated
     */
    private String pId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.price
     *
     * @mbg.generated
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.total_sale_quantity
     *
     * @mbg.generated
     */
    private Integer totalSaleQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.total_comment_quantity
     *
     * @mbg.generated
     */
    private Integer totalCommentQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.total_sale
     *
     * @mbg.generated
     */
    private Double totalSale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.happen_date
     *
     * @mbg.generated
     */
    private Date happenDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_taobaoshopproduct.shop_id
     *
     * @mbg.generated
     */
    private Long shopId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.id
     *
     * @return the value of t_taobaoshopproduct.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.id
     *
     * @param id the value for t_taobaoshopproduct.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.p_id
     *
     * @return the value of t_taobaoshopproduct.p_id
     *
     * @mbg.generated
     */
    public String getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.p_id
     *
     * @param pId the value for t_taobaoshopproduct.p_id
     *
     * @mbg.generated
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.price
     *
     * @return the value of t_taobaoshopproduct.price
     *
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.price
     *
     * @param price the value for t_taobaoshopproduct.price
     *
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.total_sale_quantity
     *
     * @return the value of t_taobaoshopproduct.total_sale_quantity
     *
     * @mbg.generated
     */
    public Integer getTotalSaleQuantity() {
        return totalSaleQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.total_sale_quantity
     *
     * @param totalSaleQuantity the value for t_taobaoshopproduct.total_sale_quantity
     *
     * @mbg.generated
     */
    public void setTotalSaleQuantity(Integer totalSaleQuantity) {
        this.totalSaleQuantity = totalSaleQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.total_comment_quantity
     *
     * @return the value of t_taobaoshopproduct.total_comment_quantity
     *
     * @mbg.generated
     */
    public Integer getTotalCommentQuantity() {
        return totalCommentQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.total_comment_quantity
     *
     * @param totalCommentQuantity the value for t_taobaoshopproduct.total_comment_quantity
     *
     * @mbg.generated
     */
    public void setTotalCommentQuantity(Integer totalCommentQuantity) {
        this.totalCommentQuantity = totalCommentQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.total_sale
     *
     * @return the value of t_taobaoshopproduct.total_sale
     *
     * @mbg.generated
     */
    public Double getTotalSale() {
        return totalSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.total_sale
     *
     * @param totalSale the value for t_taobaoshopproduct.total_sale
     *
     * @mbg.generated
     */
    public void setTotalSale(Double totalSale) {
        this.totalSale = totalSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.create_date
     *
     * @return the value of t_taobaoshopproduct.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.create_date
     *
     * @param createDate the value for t_taobaoshopproduct.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.happen_date
     *
     * @return the value of t_taobaoshopproduct.happen_date
     *
     * @mbg.generated
     */
    public Date getHappenDate() {
        return happenDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.happen_date
     *
     * @param happenDate the value for t_taobaoshopproduct.happen_date
     *
     * @mbg.generated
     */
    public void setHappenDate(Date happenDate) {
        this.happenDate = happenDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_taobaoshopproduct.shop_id
     *
     * @return the value of t_taobaoshopproduct.shop_id
     *
     * @mbg.generated
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_taobaoshopproduct.shop_id
     *
     * @param shopId the value for t_taobaoshopproduct.shop_id
     *
     * @mbg.generated
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}