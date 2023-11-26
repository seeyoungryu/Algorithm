 class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) { // 배열의 길이가 1인 경우
            int[] answer = {-1}; // 답은 -1로 구성된 배열
            return answer; // 답 반환
        }
        
        int min = arr[0]; // 초기에는 배열의 첫 번째 원소를 최소값으로 설정

        // 배열의 모든 원소와 비교하여 가장 작은 값을 찾음
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int[] answer = new int[arr.length - 1]; // 최소값을 제외한 나머지 원소를 저장하기 위한 배열
        int cnt = 0; // 배열의 인덱스를 추적하기 위한 변수

        // 배열을 순회하며 최소값과 일치하지 않는 원소를 answer 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) { // 현재 원소가 최소값과 같으면 스킵
                continue;
            }
            answer[cnt++] = arr[i]; // 최소값이 아니라면 answer 배열에 추가
        }
        return answer; // 최종 결과 배열 반환
    }
}
