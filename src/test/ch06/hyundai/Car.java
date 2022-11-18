package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	//다른 패키지에 있는 클래스를 사용 하기위해서는 반드시 임포트를 해야함
	SnowTire a = new SnowTire();
	AllSeasonTire allt = new AllSeasonTire();

	
	//import를 안하고 클래스 사용법
	
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
}
