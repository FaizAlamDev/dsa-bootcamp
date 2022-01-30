import java.util.Arrays;

public class Q01 {
	static void merge(int[] nums1, int m, int nums2[], int n) {
		int p = m - 1;
		int q = n - 1;
		int i = m + n - 1;
		while (q >= 0) {
			if (p >= 0 && nums1[p] > nums2[q]) {
				nums1[i] = nums1[p];
				i--;
				p--;
			} else {
				nums1[i] = nums2[q];
				i--;
				q--;
			}
		}
		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		merge(new int[] { 0 }, 0, new int[] { 1 }, 1);
		merge(new int[] { 1 }, 1, new int[] {}, 0);
		merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
		merge(new int[] { 4, 5, 6, 0, 0, 0 }, 3, new int[] { 1, 2, 3 }, 3);
	}
}
