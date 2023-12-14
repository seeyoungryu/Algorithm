class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        for(int i=0; i<ingredient.length-3; i++){
            if(ingredient[i]==0) continue;
            if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1){
                for(int j=i+3; j>0;j--){
                    ingredient[j] = (j>3) ? ingredient[j-4] : 0;    
                }
                answer++;    
            }
        }      
        return answer;
    }
}
