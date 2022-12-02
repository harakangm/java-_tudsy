package test.ch14_01.리스트컬렉션;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		//HashSet클래스는 논리적동등값이 저장이 안됨(동일한 객체값은 저장하지 않음)
		System.out.println(set.size());
	}
}
