import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.forEach(i -> System.out.print(i + ","));

		String[] arr = { "aa", "bb", "cc" };
		List<String> list2 = Arrays.asList(arr);
		Stream<String> s1 = Arrays.stream(arr);
		s1.sorted().forEach(System.out::println);
		
		List<String> list3 = Arrays.asList(arr);
		Stream<String> st = list3.stream();
		st.sorted().forEach(System.out::println);
	}
}
