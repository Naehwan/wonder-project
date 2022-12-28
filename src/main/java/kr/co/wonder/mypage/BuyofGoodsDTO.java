package kr.co.wonder.mypage;

import lombok.Data;

@Data
public class BuyofGoodsDTO {
	
	private int id_orderhistoty;
	private String mem_id;
	private String product_name;
	public int getId_orderhistoty() {
		return id_orderhistoty;
	}
	public void setId_orderhistoty(int id_orderhistoty) {
		this.id_orderhistoty = id_orderhistoty;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	

	
}
