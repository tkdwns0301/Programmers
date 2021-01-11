package Hash;
import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
            Vector<Integer> answer2 = new Vector<Integer>();
			HashMap<Integer, String> genre = new HashMap<Integer, String>();
			HashMap<Integer, Integer> play = new HashMap<Integer, Integer>();
			Map<String, Integer> sumPlay = new HashMap<String, Integer>();
			
			for (int i = 0; i < genres.length; i++) {
				String a = genres[i];
				sumPlay.put(genres[i], sumPlay.getOrDefault(a, 0) + plays[i]);
				genre.put(i, genres[i]);
				play.put(i, plays[i]);
			}
			
			sumPlay = sortStringMapByValue(sumPlay);
			play = sortIntMapByValue(play);

			for (Map.Entry<String, Integer> entrySumPlay : sumPlay.entrySet()) {
					Vector<Integer> temp = new Vector<Integer>();
					for (Map.Entry<Integer, Integer> entryPlay : play.entrySet()) {
						if (entrySumPlay.getKey().equals(genre.get(entryPlay.getKey()))) {
							temp.add(entryPlay.getKey());
						}
					}
					
					for(int i=0; i<temp.size(); i++) {
						if(i > 1)
							break;
						answer2.add(temp.get(i));
					}
			}

			int[] answer = new int[answer2.size()];
			
			for(int i=0; i<answer2.size(); i++) {
				answer[i] = answer2.get(i);
			}

			return answer;
    }
    public static LinkedHashMap<Integer, Integer> sortIntMapByValue(Map<Integer, Integer> album) {
		List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(album.entrySet());
		Collections.sort(entries, (o2, o1) -> o1.getValue().compareTo(o2.getValue()));
			
        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<Integer, Integer> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}

	public static LinkedHashMap<String, Integer> sortStringMapByValue(Map<String, Integer> album) {
		List<Map.Entry<String, Integer>> entries = new LinkedList<>(album.entrySet());
		Collections.sort(entries, (o2, o1) -> o1.getValue().compareTo(o2.getValue()));

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}

        return result;
	}
}