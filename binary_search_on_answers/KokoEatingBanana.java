/* 875. Koko Eating Bananas

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

Example 3:
Input: piles = [30,11,23,4,20], h = 6
Output: 23
*/

public class KokoEatingBanana {
	public static int minSpeed(int[] piles, int h) {
		int low = 1;
		int high = Integer.MIN_VALUE;

		for (int i = 0; i < piles.length; ++i) {
			if (piles[i] > high) {
				high = piles[i];
			}
		}

		int ans = 0;
		while (low <= high) {
			int mid = (high - low) / 2 + low;

			int reqHours = 0;
			for (int i = 0; i < piles.length; ++i) {
				reqHours += piles[i] / mid;
				if (piles[i] % mid != 0) {
					++reqHours;
				}

				if (reqHours > h) {
					break;
				}
			}

			if (reqHours <= h) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] piles = {312884470};
		int h = 968709470;

		System.out.println("Given piles array");
		System.out.println(java.util.Arrays.toString(piles));
		System.out.println("Given Hours: " + h);

		System.out.println();
		System.out.print("Minimum Speed of eating: ");
		System.out.println(KokoEatingBanana.minSpeed(piles, h));
	}
}