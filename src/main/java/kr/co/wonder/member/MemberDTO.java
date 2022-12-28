package kr.co.wonder.member;
	/*
	 * mem_id varchar(45) PK 
	mem_password varchar(45) 
	mem_name varchar(45) 
	mem_address1 varchar(45) 
	mem_address2 varchar(45) 
	mem_nickname varchar(45) 
	mem_homenum int 
	mem_phonenum int 
	mem_email1 varchar(45) 
	mem_email2 varchar(45) 
	mem_gender varchar(45) 
	mem_birth datetime 
	mem_cash int 
	mem_emailcert varchar(45) 
	mem_hint varchar(45) 
	mem_rating int 
	mem_first datetime 
	mem_login datetime 
	mem_logout datetime 
	product_id varchar(45)
	 */

import lombok.Data;

@Data

// product_id �궘�젣
// email2 �궘�젣
// �엺�듃瑜� �쐞�븳 吏덈Ц : hint1
// 			�떟蹂� : hint2 異붽�
	public class MemberDTO {
		private String mem_id;
		private String mem_password;
		private String mem_name;
		private String mem_address;
		private String mem_address1;
		public String getMem_id() {
			return mem_id;
		}
		public void setMem_id(String mem_id) {
			this.mem_id = mem_id;
		}
		public String getMem_password() {
			return mem_password;
		}
		public void setMem_password(String mem_password) {
			this.mem_password = mem_password;
		}
		public String getMem_name() {
			return mem_name;
		}
		public void setMem_name(String mem_name) {
			this.mem_name = mem_name;
		}
		public String getMem_address() {
			return mem_address;
		}
		public void setMem_address(String mem_address) {
			this.mem_address = mem_address;
		}
		public String getMem_address1() {
			return mem_address1;
		}
		public void setMem_address1(String mem_address1) {
			this.mem_address1 = mem_address1;
		}
		public String getMem_address2() {
			return mem_address2;
		}
		public void setMem_address2(String mem_address2) {
			this.mem_address2 = mem_address2;
		}
		public String getMem_nickname() {
			return mem_nickname;
		}
		public void setMem_nickname(String mem_nickname) {
			this.mem_nickname = mem_nickname;
		}
		public int getMem_phonenum() {
			return mem_phonenum;
		}
		public void setMem_phonenum(int mem_phonenum) {
			this.mem_phonenum = mem_phonenum;
		}
		public String getMem_email1() {
			return mem_email1;
		}
		public void setMem_email1(String mem_email1) {
			this.mem_email1 = mem_email1;
		}
		public String getMem_gender() {
			return mem_gender;
		}
		public void setMem_gender(String mem_gender) {
			this.mem_gender = mem_gender;
		}
		public String getMem_birth() {
			return mem_birth;
		}
		public void setMem_birth(String mem_birth) {
			this.mem_birth = mem_birth;
		}
		public String getMem_cash() {
			return mem_cash;
		}
		public void setMem_cash(String mem_cash) {
			this.mem_cash = mem_cash;
		}
		public String getMem_hint1() {
			return mem_hint1;
		}
		public void setMem_hint1(String mem_hint1) {
			this.mem_hint1 = mem_hint1;
		}
		public String getMem_hint2() {
			return mem_hint2;
		}
		public void setMem_hint2(String mem_hint2) {
			this.mem_hint2 = mem_hint2;
		}
		public String getMem_first() {
			return mem_first;
		}
		public void setMem_first(String mem_first) {
			this.mem_first = mem_first;
		}
		public int getMem_rating() {
			return mem_rating;
		}
		public void setMem_rating(int mem_rating) {
			this.mem_rating = mem_rating;
		}
		public String getMem_charge() {
			return mem_charge;
		}
		public void setMem_charge(String mem_charge) {
			this.mem_charge = mem_charge;
		}
		public String getMem_amount() {
			return mem_amount;
		}
		public void setMem_amount(String mem_amount) {
			this.mem_amount = mem_amount;
		}
		public String getMem_chargedate() {
			return mem_chargedate;
		}
		public void setMem_chargedate(String mem_chargedate) {
			this.mem_chargedate = mem_chargedate;
		}
		public String getMem_withdraw() {
			return mem_withdraw;
		}
		public void setMem_withdraw(String mem_withdraw) {
			this.mem_withdraw = mem_withdraw;
		}
		public String getMem_amount1() {
			return mem_amount1;
		}
		public void setMem_amount1(String mem_amount1) {
			this.mem_amount1 = mem_amount1;
		}
		public String getMem_drawdate() {
			return mem_drawdate;
		}
		public void setMem_drawdate(String mem_drawdate) {
			this.mem_drawdate = mem_drawdate;
		}
		private String mem_address2;
		private String mem_nickname;
		
		
		private int mem_phonenum;
		private String mem_email1;
		private String mem_gender;
		private String mem_birth;
		private String mem_cash;
		private String mem_hint1;
		private String mem_hint2;
		private String mem_first;
		private int mem_rating;
		private String mem_charge;
		private String mem_amount;
		private String mem_chargedate;
		private String mem_withdraw;
		private String mem_amount1;
		private String mem_drawdate;
	}
		
		
		
		

