package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		String goodsData= "";
		
		for(int i=0;i<goods.length;i++) { //사용자 입력 및 객체 생성
			goodsData = scanner.nextLine();
			String[] data = goodsData.split("\\s");
			if(data.length == 3)
				goods[i] = new Goods(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
			else
				System.out.println("에러 발생.");
		}
		
		for(int i=0;i<goods.length;i++)  //출력 반복문
			System.out.println(goods[i]);
		
		scanner.close();
	}
}
