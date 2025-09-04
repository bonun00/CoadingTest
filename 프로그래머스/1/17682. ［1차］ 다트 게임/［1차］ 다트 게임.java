import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] dart= dartResult.split("");
        String[] num={"0","1","2","3","4","5","6","7","8","9"};
        List<Integer> list=new ArrayList<>();
        int re=-1;
        for(String d: dart){
            for(String n: num){
                if(re==1&&d.equals("0")){
                    re=10;
                    break;
                }else if(d.equals(n)){
                    re=Integer.parseInt(d);
                    break;
                }
            }
            switch(d){
            case("S"):
                list.add(re);
                    break;
            case("D"):
                list.add(re*re);
                    break;
            case("T"):
                list.add(re*re*re);
                    break;
            case("*"):
                list.set(list.size()-1,list.get(list.size()-1)*2);
                
                if(list.size()>1) list.set(list.size()-2,list.get(list.size()-2)*2);
                    break;
            case("#"):
               list.set(list.size()-1,list.get(list.size()-1)*-1);
                    break;
            default:
               break;
                    
            }
        
        }
        for(Integer l: list){
            answer+=l;
        }
        
        
        
        return answer;
    }
}