package stream.study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("장원영");
		list.add("나오이 레이");
		list.add("김가을");
		list.add("이현서");
		list.add("안유진");
		
		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name +": " + Thread.currentThread().getName());
		});
	}
}
