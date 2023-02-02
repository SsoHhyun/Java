package kosa.arr;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPractice3 {

	public static void main(String[] args) {
		int[][] arr = new int[7][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int)(100*Math.random());
			}
		}
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] > o2[0])
					return 1;
				else if(o1[0] == o2[0])
					return 0;
				else
					return -1;
			}
		});
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j< 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
