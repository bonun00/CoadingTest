import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            Map<String, List<String>> card = new HashMap<>();
            String[] c = {"S", "D", "H", "C"};
            
            for(String i : c){
                card.put(i, new ArrayList<>());
            }
            
            String str = br.readLine();
            boolean flag = true;
            String temp = "";
            String m = "";
           	boolean[][] same=new boolean[4][14];
            for(int i = 1; i <= str.length(); i++){
                if(i % 3 == 1){
                    temp = "" + str.charAt(i - 1);
  
                    m = "";
                }
                if(i % 3 == 2){
                     m += str.charAt(i - 1);
                }
                if(i % 3 == 0){
                     m += str.charAt(i - 1);
                  	//card.put(temp,card.get(temp).add(Integer.parseInt(m)));
                    card.get(temp).add(m);
                    for(int a=0; a<3; a++){
						 if(temp.equals(c[a])){
                         	if(!same[a][Integer.parseInt(m)]){
                            	same[a][Integer.parseInt(m)]=true;
                            }else{
                            	flag=false;
                            }
                         }                  	
                    }
                }
            }
            
            if(flag){
                System.out.print("#" + test_case + " ");
                for(String s : c){
                    System.out.print(13-card.get(s).size() + " ");
                }
                System.out.println();        
            }else{
                System.out.println("#" + test_case + " " + "ERROR");
            }
        }
    }
}