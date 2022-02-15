public class Q13 {
	public int[][] flipAndInvertImage(int[][] image) {
		for (int[] row : image) {
			int i = 0;
			int j = row.length - 1;
			while (i <= j) {
				int temp = row[i] ^ 1;
				row[i] = row[j] ^ 1;
				row[j] = temp;
				i++;
				j--;
			}
		}
		return image;
	}
}