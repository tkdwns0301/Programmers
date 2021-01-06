package Hash;

import java.util.*;

class SolutionInefficient {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> marathon = new ArrayList<String>();
        
        for(int i=0; i<participant.length; i++) {
        	marathon.add(participant[i]);
        }
        
        for(int i=0; i<completion.length; i++) {
        	marathon.remove(completion[i]);
        }
        
        answer = marathon.get(0);
        
        return answer;
    }
}

class SolutionEfficient {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> marathon = new ArrayList<String>();
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i=0;
        
        for(i=0; i<completion.length; i++) {
        	if(participant[i].equals(completion[i])) {
        		continue;
        	}
        	else
        		break;
        }
        
        answer = participant[i];
        
        return answer;
    }
}