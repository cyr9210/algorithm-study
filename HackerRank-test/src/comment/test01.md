# test 01

### 문제
팬그램 (Pangram)
알파벳의 모든 글자를 사용하여 만든 문장을 뜻한다.
- 테스트 케이스 갯수와 문장을 입력.
- 해당 문장의 알파벳을 모두 사용 하였는지 판별하여 출력한다.
	- 모두 사용하였으면 1
	- 모두 사용하지 않았으면 0

### 샘플 테스트 케이스
4   
we promptly judged antique ivory buckles for the next prize   
we promptly judged antique ivory buckles for the prizes   
the quick brown fox jumps over the lazy dog   
the quick brown fox jump over the lazy dog   

### 샘플 결과
1010

### 해설
[나의 코드보기](https://github.com/cyr9210/algorithm-study/blob/master/HackerRank-test/src/test.java)   

- 모든 알파벳을 String[]에 넣는다.
- 입력한 문자에 대하여 char[]을 만들어 넣는다.
- 입력문자를 순서대로 확인하여 알파벳 배열에 있는것을 제외시킨다.
- 알파벳 배열이 모두 제외되어 빈 값을 가지게 되면 1
- 그렇지않으면 0을 출력한다.

