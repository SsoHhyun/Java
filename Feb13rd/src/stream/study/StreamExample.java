package stream.study;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// set 컬렉션 생성
		Set<String> set = new HashSet<String>();
		set.add("김민주");
		set.add("김채원");
		set.add("안유진");
		
		
		// Stream을 이용한요소 반복 처리
		// Stream 얻기
		Stream<String> stream = set.stream();
		// 람다식 이용
		stream.forEach(name -> System.out.println(name));
	}
}
