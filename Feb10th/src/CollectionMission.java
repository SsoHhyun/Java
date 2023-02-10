import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMission {
	public static void main(String[] args) {
		// 1. arr
		int[] arr = new int[6];
		Random r = new Random();
		
//		int a = r.nextInt(56);
//		System.out.println(a);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;
			for(int j = 0 ; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 2. ArrayList
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
			int n = r.nextInt(45) + 1;
			// 중복 제거
			if(list.contains(n)) {
				continue;
			} else {
				list.add(n);
			}
			if(list.size() == 6)	
				break;
		}
		Collections.sort(list);
		System.out.println(list);
		
		// 3. Treeset
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
	}

}
