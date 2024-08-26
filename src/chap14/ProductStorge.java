package chap14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProductStorge {

	private List<Product> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	int selectNum;
	int count;

	public void showMenu() {
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.등록  |  2.목록  |  3.종료");
			System.out.println("-------------------------");
			
			System.out.print("선택 : ");
			selectNum = sc.nextInt();
			
			switch(selectNum) {
				case 1:
					insertProduct(); 
					break;
				case 2:
					showProduct();
					break;
				case 3:
					run = false;
			}
		}
	}
	
	public void insertProduct() {
		Product product = new Product();

		product.setPno(++count);
		
		System.out.print("상품명 : ");
		product.setName(sc.next());
		
		System.out.print("가격 : ");
		product.setPrice(sc.nextInt());
		
		System.out.print("재고 : ");
		product.setStock(sc.nextInt());
		
		list.add(product);

	}
	
	public void showProduct() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getPno() + "   " + list.get(i).getName() + "   " + list.get(i).getPrice() + "   " + list.get(i).getStock());
		}
		
		for(Product s : list) {
			System.out.println(s.getPno() + "   " + s.getName() + "   " + s.getPrice() + "   " + s.getStock());
		}
	}

}
