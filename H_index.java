import java.util.*;

class Solution3 {
	public int solution(int[] citations) {
		Arrays.sort(citations);

		int max = 0;
		for (int i = 0; i < citations.length; i++) {
			int min = (int)Math.min(citations[i], citations.length-i);
			
			if(min > max)
				max = min;
		}
		return max;
	}
}