class Solution {
  public int[] solution(int n, int m) {
        int GCD = getGCD(Math.min(n, m), Math.max(n, m));

        return new int[] {GCD, (n * m) / GCD};
    }

    public int getGCD(int small, int big) {
        return big % small != 0 ? getGCD(big % small, small) : small;
    }
}
