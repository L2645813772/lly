package com.example.demo.entity;

public class Goods {
	private int gid;
	private String goodsname;
	private String goodsprice;
	private String goodstype;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", goodstype="
				+ goodstype + "]";
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	

}
