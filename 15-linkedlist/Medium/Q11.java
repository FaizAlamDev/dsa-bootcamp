public class Q11 {
	public ListNode rotateRight(ListNode head, int k) {
		if (k <= 0 || head == null || head.next == null) {
			return head;
		}
		int length = 1;
		ListNode last = head;
		while (last.next != null) {
			last = last.next;
			length++;
		}

		last.next = head;
		int rotations = k % length;
		ListNode newLast = head;
		for (int i = 1; i < length - rotations; i++) {
			newLast = newLast.next;
		}
		head = newLast.next;
		newLast.next = null;
		return head;
	}
}
