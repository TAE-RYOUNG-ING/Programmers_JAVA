// 풀이시간 14:26


class Solution {
  public long solution(String numbers) {

    String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for(int i=0; i <arr.length; i++) {
      numbers = numbers.replaceAll(arr[i], String.valueOf(i));
    }

    long answer = Long.parseLong(numbers);
    return answer;
  }
}
