class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 시전시간
        int x = bandage[1]; // 회복체력
        int y = bandage[2]; // 추가회복체력
        int cons = 0;       // 연속성공시간
        int max_health = health; // 최대체력
        int now_attack = 0;
        int last = attacks[attacks.length-1][0]; // 마지막 공격 시각
        
        for(int i=1; i<=last; i++) {
            if(i == attacks[now_attack][0]) {
                health -= attacks[now_attack][1];
                now_attack++;
                cons = 0;
            } else {
                cons++;
                health += x;
                
                if(cons == t) {
                    health += y;
                    cons = 0;
                }
                
                if(health > max_health) {
                    health = max_health;
                }
            }
            
            if(health <= 0) {
                return -1;
            }
        }
        
        return health;
    }
}