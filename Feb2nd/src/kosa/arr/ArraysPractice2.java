package kosa.arr;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPractice2 {

	public static void main(String[] args) {
		int[][] brr = new int[5][2];
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 2; j++) {
				brr[i][j] = (int)(100*(Math.random()));
			}
			Arrays.sort(brr, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] > o2[0])
						return 1;
					else if(o1[0] < o2[0])
						return -1;
					else
						return 0;
				}
			});
		}
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[0].length; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
