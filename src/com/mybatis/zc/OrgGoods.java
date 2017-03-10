package com.mybatis.zc;


public class OrgGoods implements java.io.Serializable {

	private Integer id;
	private String customerNo;
	private String goodsNo;
	private String goodsName;
	private String specifical;
	private Integer packType;
	private Integer goodsNum;
	private Integer unit;
	private Double totalWeight;
	private Double totalVolume;

	public OrgGoods() {
	}

	public OrgGoods(String customerNo, String goodsNo) {
		setCustomerNo(customerNo);
		setGoodsNo(goodsNo);
	}

	public OrgGoods(String customerNo, String goodsNo, String goodsName,
			String specifical, Integer packType, Integer goodsNum,
			Integer unit, Double totalWeight, Double totalVolume) {
		setCustomerNo(customerNo);
		setGoodsNo(goodsNo);
		setGoodsName(goodsName);
		setSpecifical(specifical);
		setPackType(packType);
		setGoodsNum(goodsNum);
		setUnit(unit);
		setTotalWeight(totalWeight);
		setTotalVolume(totalVolume);
	}


	public final Integer getId() {
		return this.id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}


	public final String getCustomerNo() {
		return this.customerNo;
	}

	public final void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}


	public final String getGoodsNo() {
		return this.goodsNo;
	}

	public final void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}


	public final String getGoodsName() {
		return this.goodsName;
	}

	public final void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public final String getSpecifical() {
		return this.specifical;
	}

	public final void setSpecifical(String specifical) {
		this.specifical = specifical;
	}


	public final Integer getPackType() {
		return this.packType;
	}

	public final void setPackType(Integer packType) {
		this.packType = packType;
	}


	public final Integer getGoodsNum() {
		return this.goodsNum;
	}

	public final void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}


	public final Integer getUnit() {
		return this.unit;
	}

	public final void setUnit(Integer unit) {
		this.unit = unit;
	}


	public final Double getTotalWeight() {
		return this.totalWeight;
	}

	public final void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}


	public final Double getTotalVolume() {
		return this.totalVolume;
	}

	public final void setTotalVolume(Double totalVolume) {
		this.totalVolume = totalVolume;
	}

}
