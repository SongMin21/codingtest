class Solution {
    public int solution(int hp) {
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnt = 1;
        
        int antCnt = 0;
        
        antCnt += hp / generalAnt;
        hp = hp % generalAnt;
        antCnt += hp / soldierAnt;
        hp = hp % soldierAnt;
        antCnt += hp / workerAnt;
        
        return antCnt;
    }
}