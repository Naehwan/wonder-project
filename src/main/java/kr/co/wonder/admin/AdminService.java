package kr.co.wonder.admin;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.co.wonder.member.MemberDTO;

public interface AdminService {

		//�긽�뭹�벑濡�
		public int productAdd(AdminProductDTO adminProductDTO) throws Exception;
		//�긽�뭹紐⑸줉
		public List<AdminProductDTO> productList() throws Exception;
		//�긽�뭹�긽�꽭紐⑸줉
		public AdminProductDTO productDetail(int product_id) throws Exception; 
		//�긽�뭹�닔�젙
		public int productEdit(AdminProductDTO adminProductDTO) throws Exception;
		//�긽�뭹�궘�젣
		public int productDelete(int product_id) throws Exception;
		//�쉶�썝紐⑸줉
		public List<AdminMemDTO> memList() throws Exception;
		//�쉶�썝�긽�꽭紐⑸줉
		public AdminMemDTO memDetail(String mem_id) throws Exception;
		//�쉶�썝�벑湲됰�寃�
		public int memUpdate(AdminMemDTO adminMemDTO) throws Exception;
		//寃쎈ℓ�긽�뭹紐⑸줉
		public List<AdminAuctionDTO> auctionList() throws Exception;
		//�삦�뀡 �긽�꽭
		public AdminAuctionDTO auctionDetail(int ab_id) throws Exception;
		//�떊怨좊맂�긽�뭹紐⑸줉
		public List<AdminAuctionDTO> reportList() throws Exception;
		//寃쎈ℓ�긽�뭹�궘�젣
		public int auctionDelete(int ab_id) throws Exception;
		//怨듭��궗�빆紐⑸줉
		public List<AdminNoticeDTO> noticeList() throws Exception;
		//怨듭��궗�빆 醫낅쪟蹂� 紐⑸줉
		public List<AdminNoticeDTO> sortlist(String notice_sort) throws Exception;
		//怨듭��궗�빆�벑濡�
		public int noticeAdd(AdminNoticeDTO adminNoticeDTO) throws Exception;
		//怨듭��궗�빆�닔�젙
		public int noticeUpdate(AdminNoticeDTO adminNoticeDTO) throws Exception;
		//怨듭��궗�빆�궘�젣
		public int noticeDelete(int notice_id) throws Exception;
		//1:1臾몄쓽 紐⑸줉
		public List<AdminInquiryDTO> inquiryList() throws Exception; 
		//1:1臾몄쓽 �긽�꽭紐⑸줉
		public AdminInquiryDTO inquiryDetail(int inquiry_id) throws Exception;
		//1:1臾몄쓽 �떟蹂�
		public int inquirtAnswer(AdminInquiryDTO inquiryDTO) throws Exception;
		//1:1臾몄쓽 �떟蹂��셿猷�
		public int inquiryend(AdminInquiryDTO inquiryDTO) throws Exception;
		//�뾽濡쒕뱶
		public String uploadFile(MultipartFile[] upload) throws Exception;
		//異⑹쟾�떊泥��궡�뿭
		public List<MemberDTO> cashcharge() throws Exception;
		//異⑹쟾�떊泥� �듅�씤
		public int charge(MemberDTO memberDTO) throws Exception;
		//異⑹쟾�떊泥� �궘�젣
		public int chargedelete(MemberDTO memberDTO)throws Exception;
}
