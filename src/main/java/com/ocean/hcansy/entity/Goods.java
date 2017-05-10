package com.ocean.hcansy.entity;

/**
 * 商品信息
 * @author yunhai
 *
 */
public class Goods {

	/** 主键ID */
	private Long id;
	
	/** 商品名称 */
	private String goodsName;
	
	/** 商品简介 */
	private String synopsis;
	
	/** 商品单价 */
	private Float price;
	
	/** 商品数量 */
	private Integer goodsNum;
	
	/** 商品总价 */
	private Integer priceSum;
	
	/** 商品移除标记 */
	private Integer flag = 1;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getPriceSum() {
		return priceSum;
	}

	public void setPriceSum(Integer priceSum) {
		this.priceSum = priceSum;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	
}
