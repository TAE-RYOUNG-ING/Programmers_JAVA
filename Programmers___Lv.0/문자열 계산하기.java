// 풀이시간 13:29


class Solution {
  public int solution(String my_string) {

    String[] str = my_string.split(" ");
    int answer = Integer.parseInt(str[0]);

    for(int i=1; i<str.length; i+=2) {
      if(str[i].equals("+")) {
        answer += Integer.parseInt(str[i+1]);
      }
      else if(str[i].equals("-")) {
        answer -= Integer.parseInt(str[i+1]);
      }
    }

    return answer;
  }
}
