import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q09 {
	static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(index[i], nums[i]);
		}
		int[] target = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			target[i] = list.get(i);
		}
		return target;
	}

	public static void main(String[] args) {
		System.out
				.println(Arrays.toString(createTargetArray(new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 })));
	}
}
