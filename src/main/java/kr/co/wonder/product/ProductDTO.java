package kr.co.wonder.product;

import java.util.Date;

import lombok.Data;


@Data
public class ProductDTO {
	
	private String product_id;
	private String product_name;
	private	String product_price;
	private String product_desc;
	private Date product_date;
	private String product_hits;
	private String product_size;
	private String product_auction;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public Date getProduct_date() {
		return product_date;
	}
	public void setProduct_date(Date product_date) {
		this.product_date = product_date;
	}
	public String getProduct_hits() {
		return product_hits;
	}
	public void setProduct_hits(String product_hits) {
		this.product_hits = product_hits;
	}
	public String getProduct_size() {
		return product_size;
	}
	public void setProduct_size(String product_size) {
		this.product_size = product_size;
	}
	public String getProduct_auction() {
		return product_auction;
	}
	public void setProduct_auction(String product_auction) {
		this.product_auction = product_auction;
	}
	public String getProduct_cate() {
		return product_cate;
	}
	public void setProduct_cate(String product_cate) {
		this.product_cate = product_cate;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
	private String product_cate;
	private String product_code;
	private String mem_id;
	private String product_img;
	
	
}
