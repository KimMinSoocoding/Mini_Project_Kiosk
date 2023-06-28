package vo;

import java.io.Serializable;

public class ProductVO implements Serializable,Cloneable {
	private int proNum;
	private String proName;
	private int proPrice;
	private int proCategory;
	private int cnt=1;
	
	public void increaseCnt() {
		cnt++;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public ProductVO() {
		// TODO Auto-generated constructor stub
	}

	public ProductVO(int proNum, String proName, int proPrice, int proCategory) {
		super();
		this.proNum = proNum;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proCategory = proCategory;
	}


	@Override
	public String toString() {
		return "제품코드: " + proNum + "  제품: " + proName + " 가격: " + proPrice + "원  "  ;
	}
	public String toStringCnt() {
		return "제품코드: " + proNum + "  제품: " + proName + " 가격: " + proPrice + "원  " + cnt + "개" ;
	}
	

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getProCategory() {
		return proCategory;
	}

	public void setProCategory(int proCategory) {
		this.proCategory = proCategory;
	}

//	protected ProductVO clone()  {
//		ProductVO obj = null;
//		try {
//			obj = (ProductVO)super.clone();
//			obj.cnt = this.cnt.clone();
//		} catch (CloneNotSupportedException e) {}
//	
//		return (ProductVO)obj;
//	}
	
}
