package FuntionalInterface;

public class Main {
	public static void main(String[] args) {
		Add add = () -> 22;
		System.out.println(add.add());
		
		AddWithParemeter addP;
		addP = (a,b) -> (a+b);
		
		int add1 = addP.add1(22, 22);
		System.out.println(add1);
		
		//Block Lambda Expressions
		Add add2 = () ->{
			int sum = 0;
			for(int i = 0;i<10;i++) {
				sum+=i;
			}
			return sum;
		};
		int i = add2.add();
		System.out.println(i);
	}

}
