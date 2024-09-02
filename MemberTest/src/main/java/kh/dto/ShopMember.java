package kh.dto;

public class ShopMember {
	// 필드
	private String memberId;
	private String memberPw;
	private String phone;
	private String gender;
	
	// 생성자
	public ShopMember() {}
	
	public ShopMember(String memberId, String memberPw, String phone, String gender) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.phone = phone;
		this.gender = gender;
	}
	
	// getter/setter
	
	
	@Override
	public String toString() {
		return memberId + ", " + memberPw + ", " + phone + ", " + gender;
		// memberId, memberPw, phone, gender
	}
	
}
