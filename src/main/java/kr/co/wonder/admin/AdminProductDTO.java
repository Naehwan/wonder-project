package kr.co.wonder.admin;

import lombok.Data;

@Data

public class AdminProductDTO {

	private int product_id;
	private String product_name;
	private String product_desc;
	private String product_cate;
	private String product_code;
	private String product_img;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
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
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
}
