/* Two Sum : Check if a pair with given sum exists in Array

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Examples

Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
Output : YES
Explanation: arr[1] + arr[3] = 14. So, the answer is "YES" for first variant for second variant output will be : [1,3].

Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
Output : NO.
Explanation: There exist no such two numbers whose sum is equal to the target. 
*/

public class TwoSum {
	public static int[] getIdx(int[] array, int target) {
		int[] ans = {-1, -1};

		java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

		for (int i = 0; i < array.length; ++i) {
			if (map.containsKey(target - array[i])) {
				ans[0] = map.get(target- array[i]);
				ans[1] = i;
				break;
			}
			map.put(array[i], i);
		}

		return ans;
	}

	public static boolean isExists(int[] array, int target) {
		int[] ans = TwoSum.getIdx(array, target);
		if (ans[0] == -1 || ans[1] == -1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array = {2,6,5,8,11};
		int target = 15;

		IO.println("Given Array is");
		IO.println(java.util.Arrays.toString(array));

		IO.println();
		IO.print("Is target sum " + target + " exists? ");
		IO.println(TwoSum.isExists(array, target) ? "YES" : "NO");
		IO.print("Idx of elements to add to give target sum: ");
		IO.println(java.util.Arrays.toString(TwoSum.getIdx(array, target)));
	}
}