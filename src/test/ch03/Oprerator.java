package test.ch03;

public class Oprerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부호 연산자
//		int x  = -100;
//		x = -x;
//		System.out.println(x);
		
		// 전위연산자 후위연산자
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		System.out.println("---------------------");
		
		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("---------------------");
		
		//후위 연산자는 대입을 먼저함
		z = x++;
		System.out.println("z= " + z);
		System.out.println("z= " + x);
		
		System.out.println("---------------------");
		// 전위연산자는 계산을 하고 대입함
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("z= " + x);
		
		System.out.println("---------------------");
		// 전위연산자는 계산을 하고 대입함
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + x);
	}

}
