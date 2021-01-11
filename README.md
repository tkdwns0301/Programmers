# Programmers
코딩테스트 문제 풀기

2021.01.04 
  - [K번째 수](https://programmers.co.kr/learn/courses/30/lessons/42748)
    - Sort
  
2021.01.05 
  - [가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746)
    - Sort
    - Array, [Comparator](https://ifuwanna.tistory.com/232)
    - String.join - 배열 합칠 때 사용한다.
  - [H-index](https://programmers.co.kr/learn/courses/30/lessons/42747)
    - Sort
    - H-index는 citations의 원소가 아닐 수 있다. (질문목록에서 얻은 힌트)
    - H-index는 최대 citations.length 이다.
    - 어짜피 수는 정렬 시키므로, H-index가 될 수 있는 가장 큰 수와, citations의 가장 첫번째 원소를 비교하여 H-index를 알아냈다.

2021.01.06
  - [완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)
    - Hash
    - ArrayList를 써서 participant의 index값을 다 넣은 다음, completion의 항목으로 remove를 해줘서 남은 것을 하려고 함. But 비효율적
    - Sort를 하고 비교하면서 같지 않으면 break를 시켜줌으로써 for문 한번에 찾을 수 있도록 풀었다.
    
2021.01.07
  - [전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577?language=java)
    - Hash
    - easy~
  - [위장](https://programmers.co.kr/learn/courses/30/lessons/42578?language=java)
    - Hash
    - [Map<K,V>.getOrDefault](https://jiwontip.tistory.com/21)
    - (A에서 하나를 고를 때 * B에서 하나를 고를 때 * ...) - 모두 안골랐을때의 경우

2021.01.11
  - [베스트앨범](https://programmers.co.kr/learn/courses/30/lessons/42579)
    - Hash
    - 너무 어렵다...
    - [Sort](https://coding-factory.tistory.com/549)
    - [Map을 정렬하는 방법](https://codechacha.com/ko/java-sort-map/)
    - [Map.Entry<K, V>](http://cris.joongbu.ac.kr/course/java/api/java/util/Map.Entry.html)
    - 일단 장르와 플레이를 HashMap안에 넣어주고, 합한 결과가 필요하므로 sumPlay(Map)에 넣어줬다. 그리고 이들을 정렬시켜 준 뒤 비교를 통해 answer에 넣어줬다.
    - 코드가 더럽지만 일단 푼거에 만족~
    
2021.01.12
  - [모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840?language=java)
    - 완전탐색
    - 더럽게 풀어서 이렇게 하는게 맞나 싶었는데 다른사람 코드 보니까 거의 비슷한 알고리즘을 가진다!
