package kr.co.wonder.notice;

import lombok.Data;

@Data
public class NoticeDTO {
	private int notice_id;
	private String notice_title;
	private String notice_sort;
	private String notice_content;
	private String notice_date;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_sort() {
		return notice_sort;
	}
	public void setNotice_sort(String notice_sort) {
		this.notice_sort = notice_sort;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}
}
