package kosa.arr;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPractice {

	public static void main(String[] args) {
		int[][] arr = {{2, 7}, {3, 9}, {56, 23}};
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

	}

}
