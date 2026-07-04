/* Merge Overlapping Sub-intervals

Problem Statement: Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

Examples
Input : intervals=[[1,3],[2,6],[8,10],[15,18]]
Output : [[1,6],[8,10],[15,18]]
Explanation : Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6] intervals.
Input : [[1,4],[4,5]]
Output :  [[1,5]]
Explanation :  Since intervals [1,4] and [4,5] are overlapping we can merge them to form [1,5].
*/

public class MergeOverlappingSubIntervals {
	public static int[][] merge(int[][] intervals) {
		java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		java.util.List<int[]> list = new java.util.ArrayList<>();

		for (int i = 0; i < intervals.length; ++i) {
			if(i == 0 || intervals[i][0] > list.get(list.size() - 1)[1]) {
				list.add(new int[]{intervals[i][0], intervals[i][1]});
			} else {
				int[] interval = list.get(list.size() - 1);
				interval[1] = Integer.max(list.get(list.size() - 1)[1], intervals[i][1]);
			}
		}

		int[][] ans = new int[list.size()][2];
		for (int i = 0; i < ans.length; ++i) {
			ans[i] = list.get(i);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[][] intervals = {{4,7}, {1,4}};

		IO.println("Given Intervals: ");
		IO.println(java.util.Arrays.deepToString(intervals));

		IO.println();
		IO.println("After merged Intervals: ");
		IO.println(java.util.Arrays.deepToString(MergeOverlappingSubIntervals.merge(intervals)));
	}
}