package prob06;

import java.util.Scanner;

//다수의 클래스를 정의해보고 활용하는 연습입니다.
//조건: 두개의 피연산자만 입력받고 반드시 입력은 3 + 2 <- 이런 형태로 입력받는다. 
public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print(">> ");
			String values = scanner.nextLine();
			
			if(values.equals("quit") || values.equals("QUIT"))
				break;
			
			String[] datas = values.split("\\s");
			
			int num = Integer.parseInt(datas[0]);
			int num2 = Integer.parseInt(datas[2]);
			
			Arith[] arith = { new Add(),
							  new Sub(),
							  new Mul(),
							  new Div()
							};
		
			switch(datas[1]) {
				case "+":
					arith[0].setValue(num, num2);
					System.out.println(">> " + arith[0].calculate());
					break;
				case "-":
					arith[1].setValue(num, num2);
					System.out.println(">> " + arith[1].calculate());
					break;
				case "*":
					arith[2].setValue(num, num2);
					System.out.println(">> " + arith[2].calculate());
					break;
				case "/":
					if(num2 == 0) {
						System.out.println("0으로는 나눌 수 없습니다.");
						break;
					}
					arith[3].setValue(num, num2);
					System.out.println(">> " + arith[3].calculate());
					break;
			}
		}
		
		scanner.close();

	}

}
