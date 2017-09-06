
public class LL {
	public static void main(String[] args) {
		System.out.println(printHeart("*"));
	}

	private static String printHeart(String input) {
		int[] array = { 0, 1, 0, 0, 0, 6, 0, 
				        1, 0, 1, 0, 1, 0, 1, 
				        1, 0, 0, 1, 0, 0, 8, 
				        1, 4, 5, 2, 3, 4, 9, 
				        0, 1, 0, 0, 0, 12, 0, 
				        0, 0, 13, 0, 11, 0, 0, 
				        0, 0, 0, 10, 0, 0, 0,
				        };
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			if (i % 7 == 0)
				sb.append("\n");
			if (array[i] == 0)
				sb.append("  ");
			else if (array[i] == 4)
				sb.append(" ");
			else if (array[i] == 5)
				sb.append(" I ");
			else if (array[i] == 2)
				sb.append("Lvoe ");
			else if (array[i] == 3)
				sb.append("You");
			else if (array[i] == 6)
				sb.append("    *");
			else if (array[i] == 8)
				sb.append("   *");
			else if (array[i] == 9)
				sb.append(" "+input);
			else if (array[i] == 10)
				sb.append("   "+input);
			else if (array[i] == 11)
				sb.append("  "+input);
			else if (array[i] == 12)
				sb.append("    "+input);
			else if (array[i] == 13)
				sb.append("   "+input);
			else
				sb.append("  " + input);
		}
		return sb.toString();
	}
}

