package com.yyk.entity;

import java.util.List;

public class Goods {
	private Integer gid;
	
	private String gname;
	
	private String ywname;
	
	
	private List<Goods_type> ts;
	
	
	private List<Goods_brand> bs;
	
	private Double size;
	
	private Double price;
	
	private Integer quantity;//ÊýÁ¿
	
	private String label;
	
	private String pic;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getYwname() {
		return ywname;
	}

	public void setYwname(String ywname) {
		this.ywname = ywname;
	}

	public List<Goods_type> getTs() {
		return ts;
	}

	public void setTs(List<Goods_type> ts) {
		this.ts = ts;
	}

	public List<Goods_brand> getBs() {
		return bs;
	}

	public void setBs(List<Goods_brand> bs) {
		this.bs = bs;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ywname=" + ywname + ", ts=" + ts + ", bs=" + bs + ", size="
				+ size + ", price=" + price + ", quantity=" + quantity + ", label=" + label + ", pic=" + pic + "]";
	}

	public Goods(Integer gid, String gname, String ywname, List<Goods_type> ts, List<Goods_brand> bs, Double size,
			Double price, Integer quantity, String label, String pic) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ywname = ywname;
		this.ts = ts;
		this.bs = bs;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.label = label;
		this.pic = pic;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
