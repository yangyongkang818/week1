package com.yyk.vo;

import java.util.List;

import com.yyk.entity.Goods;
import com.yyk.entity.Goods_brand;
import com.yyk.entity.Goods_type;

public class GoodsVO extends Goods{
	
	private double p1;
	private double p2;
	
	private String tname;//ÖÖÀà
	private String bname;//Æ·ÅÆ
	
	private String name;

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GoodsVO [p1=" + p1 + ", p2=" + p2 + ", tname=" + tname + ", bname=" + bname + ", name=" + name + "]";
	}

	public GoodsVO(Integer gid, String gname, String ywname, List<Goods_type> ts, List<Goods_brand> bs, Double size,
			Double price, Integer quantity, String label, String pic, double p1, double p2, String tname, String bname,
			String name) {
		super(gid, gname, ywname, ts, bs, size, price, quantity, label, pic);
		this.p1 = p1;
		this.p2 = p2;
		this.tname = tname;
		this.bname = bname;
		this.name = name;
	}

	public GoodsVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsVO(Integer gid, String gname, String ywname, List<Goods_type> ts, List<Goods_brand> bs, Double size,
			Double price, Integer quantity, String label, String pic) {
		super(gid, gname, ywname, ts, bs, size, price, quantity, label, pic);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
