package leat.code.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 1, 2, 3 }, 3);

		// merge(new int[] { 0,1,3 }, 3, new int[] { 1 }, 1);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int j = 0, i = m; j < n; j++) {
			nums1[i] = nums2[j];
			i++;
		}

		Arrays.sort(nums1);

		for (int i = 0; i < nums1.length; i++) {
			System.out.println("[i]==>" + nums1[i]);
		}
	}

}
