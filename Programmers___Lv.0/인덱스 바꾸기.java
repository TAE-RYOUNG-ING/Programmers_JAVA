// 풀이시간 10:11

class Solution {
  public String solution(String my_string, int num1, int num2) {
      
    String answer = "";
    String[] arr = my_string.split("");

    String s = arr[num1];
    arr[num1] = arr[num2];
    arr[num2] = s;

    return String.join("", arr);
  }
}
