package test.ch07.pakage2;

import test.ch07.pakage1.A접근제한자;

public class C접근제한자 {
	A접근제한자 a = new A접근제한자(); // 접근 불가 패키지가 다름
	
	a.field = "1"; // 별문제 없이 접근가능
	a.method(); // o
}
