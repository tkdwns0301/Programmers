package Hash;
import java.util.*;

class SolutionSpy {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> spy = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length; i++) {
        	spy.put(clothes[i][1], spy.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        Collection<Integer> values = spy.values();
        for (Integer value : values) {
        	answer = answer*(value + 1);
        }
        
        
        return answer-1;
    }
}