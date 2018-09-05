import java.util.Arrays;

public class SandwichBar {
	public int whichOrder(String[] available, String[] orders) {
		for(int k=0; k < orders.length; k += 1) {
			if (canMake(orders[k],available)) {
				return k;
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param sandwich is space-separated list of strings
	 * @param available is ingredients available
	 * @return true iff all "strings" in sandwich are in available
	 */
	private boolean canMake(String sandwich, String[] available) {
		for(String s : sandwich.split(" ")) {
			if (! Arrays.asList(available).contains(s)) {
				return false;
			}
		}
		return true;
	}
}
