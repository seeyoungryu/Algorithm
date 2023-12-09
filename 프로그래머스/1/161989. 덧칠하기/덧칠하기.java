import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, 1);

        for(int i = 0; i < section.length; i++)
            arr[section[i]] = 0;

        int count = 0;
        int i = 0;
        while(true) {
            int idx = section[i++];
            if(arr[idx] == 0) {
                count++;
                for(int j = idx; j < idx + m; j++) {
                    if(j > n)
                        break;
                    arr[j] = 1;
                }
            }
            if(idx == section[section.length-1])
                break;
        }
        return count;
    }
}
