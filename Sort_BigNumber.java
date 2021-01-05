import java.util.*;

class Solution2 {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(answer, new Comparator<String>() {
        	@Override
        	public int compare(String str1, String str2) {
        		return (str2+str1).compareTo(str1+str2);
        	}
        });
        
        if(answer[0].equals("0"))
        	return answer[0];
        else
        	return String.join("", answer);
    }
}