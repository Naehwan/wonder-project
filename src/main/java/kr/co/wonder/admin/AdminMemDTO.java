package kr.co.wonder.admin;

import lombok.Data;

@Data
public class AdminMemDTO {

	
	private int mem_id;
	private String mem_name;
	private String mem_nickname;
	private int mem_rating;
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public int getMem_rating() {
		return mem_rating;
	}
	public void setMem_rating(int mem_rating) {
		this.mem_rating = mem_rating;
	}
}
