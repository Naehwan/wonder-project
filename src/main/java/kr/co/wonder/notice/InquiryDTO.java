package kr.co.wonder.notice;

import lombok.Data;

@Data
public class InquiryDTO {

	private int inquiry_id;
	private String inquiry_title;
	private String inquiry_content;
	private String inquiry_date;
	private String inquiry_sort;
	private String mem_id;
	public int getInquiry_id() {
		return inquiry_id;
	}
	public void setInquiry_id(int inquiry_id) {
		this.inquiry_id = inquiry_id;
	}
	public String getInquiry_title() {
		return inquiry_title;
	}
	public void setInquiry_title(String inquiry_title) {
		this.inquiry_title = inquiry_title;
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
	public String getInquiry_sort() {
		return inquiry_sort;
	}
	public void setInquiry_sort(String inquiry_sort) {
		this.inquiry_sort = inquiry_sort;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
}
