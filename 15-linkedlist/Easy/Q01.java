public class Q01 {
	public int getDecimalValue(ListNode head) {
		String number = "";
		while (head != null) {
			int val = head.val;
			number += String.valueOf(val);
			head = head.next;
		}
		int binary = 0;
		int power = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			binary += (int) (number.charAt(i) - '0') * Math.pow(2, power);
			power++;
		}
		return binary;
	}

	// Best Method
	public int getDecimalValue2(ListNode head) {
		int ans = 0;
		while (head != null) {
			ans = (ans << 1) | head.val;
			head = head.next;
		}
		return ans;
	}
}
