package test.ch15_01.람다식;

import java.util.stream.IntStream;

public class 인트스트림 {

	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(value -> System.out.println(value));
	}

}
