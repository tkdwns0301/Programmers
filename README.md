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
