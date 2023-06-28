package vo;


public class Member{
	private int coupon;
	private String tel;

	public Member() {
	}
	
	
	public Member(int coupon, String tel) {
		super();
		this.coupon = coupon;
		this.tel = tel;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "회원정보 : [coupon=" + coupon + ", tel=" + tel + "]";
	}

	
	
}