package kr.co.wonder.admin;

import lombok.Data;

@Data
public class AdminAuctionDTO {
	private int ab_id;
	private String ab_title;
	private String ab_img;
	private int product_id;
	private String ab_limit;
	public int getAb_id() {
		return ab_id;
	}
	public void setAb_id(int ab_id) {
		this.ab_id = ab_id;
	}
	public String getAb_title() {
		return ab_title;
	}
	public void setAb_title(String ab_title) {
		this.ab_title = ab_title;
	}
	public String getAb_img() {
		return ab_img;
	}
	public void setAb_img(String ab_img) {
		this.ab_img = ab_img;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getAb_limit() {
		return ab_limit;
	}
	public void setAb_limit(String ab_limit) {
		this.ab_limit = ab_limit;
	}
	public String getAb_date() {
		return ab_date;
	}
	public void setAb_date(String ab_date) {
		this.ab_date = ab_date;
	}
	private String ab_date;
	
}
