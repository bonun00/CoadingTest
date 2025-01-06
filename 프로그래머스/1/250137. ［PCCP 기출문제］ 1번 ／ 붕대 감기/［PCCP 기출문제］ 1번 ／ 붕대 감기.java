class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int heal_plus=0;
        int at_len=attacks.length;
        int at_num=0;
        int max_health=health;
        
        for(int i=0; i<=attacks[at_len-1][0];i++){
            if(att(i,at_num,attacks)){
                health=deal(health,attacks[at_num][1]);
                 at_num+=1;
                if (health<0){
                    break;
                }
                heal_plus=0;
            }else if(heal_plus+1==bandage[0]){
                health=healing(health,max_health,bandage);
                heal_plus=0;
            }else{
                health=heal(health,max_health,bandage);
                heal_plus+=1;
            }
            
        }
        if(health>0){
        answer=health;
        }else{
            answer=-1;
        }
            return answer;
    }
    
    public boolean att(int i,int at_num, int[][] attacks){
        
        if(attacks[at_num][0]==i){
            return true;
        }else{
            return false;
        }
    }
     public int deal(int health, int die){
        if(health-die<0){
            return -1;
        }else{
            return health-die;
        }
    }
    
    public int healing(int health,int max_health, int[] bandage){
        if (health+bandage[2]+bandage[1]<=max_health){
            return health+bandage[2]+bandage[1];
        }else{
            return max_health;
        }
    }
    
    
    public int heal(int health,int max_health,int[]bandage){
        if(health+bandage[1]<=max_health){
            return health+bandage[1];
        }else{
            return max_health;
        }
    }
    
}