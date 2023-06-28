package service;

import java.util.List;
import vo.ProductVO;


public interface ProductService  {
	/**
	 * @author 김민수 
	 * @since 23/02/06
	 * 
	 * 
	 * 음료 카테고리 소분류 
	 * 
	 */
	
	ProductVO findBy(int no);
	
	/**
	 * 김민수  
	 *
	 * 음료별 카테고리 분류
	 * @return 
	 */
	void showCategory(int input);
	
	public int checkRange(int num,int start,int end);

	List<ProductVO> getProCategory();

//	void addProCategory(ProductVO proCategory);
	
	void save();

}
