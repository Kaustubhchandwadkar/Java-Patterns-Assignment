package PatternAssignment;

public class Pattern22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print("X ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}


}