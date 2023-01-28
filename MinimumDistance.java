public class MinimumDistance {
	public static void main(String[] args) {
		String[] arr = { "the", "quick", "brown", "fox", "is", "quick" };
		String from = "the";
		String to = "fox";
		int index = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == from) {
				index = i;
				break;
			}
		}
		for (int j = index + 1; j < arr.length; j++) {
			count++;
			if (arr[j] == to) {
				break;
			}
		}

		System.out.println(count);
	}
}
