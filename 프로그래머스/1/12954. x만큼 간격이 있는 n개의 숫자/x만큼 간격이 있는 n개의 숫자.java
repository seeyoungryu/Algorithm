import java.util.*;

class Solution {
    public static long[] solution(int x, int n) {
        // 결과를 저장할 배열을 생성합니다.
        long[] answer = new long[n];
        
        // 배열의 첫 번째 요소에는 x를 저장합니다.
        answer[0] = x;

        // 배열의 두 번째 요소부터 n번째 요소까지 반복하여 값을 계산하여 저장합니다.
        for (int i = 1; i < n; i++) {
            // 이전 요소에 x를 더한 값을 현재 요소에 저장합니다.
            answer[i] = answer[i - 1] + x;
        }

        // 계산된 결과가 저장된 배열을 반환합니다.
        return answer;
    }
}