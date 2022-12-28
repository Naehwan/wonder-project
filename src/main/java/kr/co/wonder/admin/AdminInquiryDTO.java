package kr.co.wonder.admin;

import lombok.Data;

@Data
public class AdminInquiryDTO {

	public int getInquiry_id() {
		return inquiry_id;
	}
	public void setInquiry_id(int inquiry_id) {
		this.inquiry_id = inquiry_id;
	}
	public String getInquiry_content() {
		return inquiry_content;
	}
	public void setInquiry_content(String inquiry_content) {
		this.inquiry_content = inquiry_content;
	}
	public String getInquiry_date() {
		return inquiry_date;
	}
	public void setInquiry_date(String inquiry_date) {
		this.inquiry_date = inquiry_date;
	}
	public String getInquiry_state() {
		return inquiry_state;
	}
	public void setInquiry_state(String inquiry_state) {
		this.inquiry_state = inquiry_state;
	}
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
	public String getInquiry_title() {
		return inquiry_title;
	}
	public void setInquiry_title(String inquiry_title) {
		this.inquiry_title = inquiry_title;
	}
	private int inquiry_id;
	private String inquiry_content;
	private String inquiry_date;
	private String inquiry_state;
	private int mem_id;
	private String mem_name;
	private String inquiry_title;
}
