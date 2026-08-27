
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    static int[][] pro;
    static int s;
    static int[][] move={{1,0},{0,1},{0,-1},{-1,0}};
    static List<int[]> arr;
    static int ans;
    static int ans2;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			 s=sc.nextInt();
            pro=new int[s][s];
            arr=new ArrayList<>();
            ans=Integer.MIN_VALUE; 
            ans2=Integer.MAX_VALUE;
            
            for(int i=0; i<s; i++){
            	 for(int j=0; j<s; j++){
            		pro[i][j]=sc.nextInt();
                    if(i==0||j==0||i==s-1||j==s-1)continue;
                    if(pro[i][j]==1){
                    	arr.add(new int[]{i,j});
           
                    }
            	}
            }
            boolean[][] wire=new boolean[s][s];
            
            dfs(0,0,arr.size(),0,wire);
            System.out.println("#"+test_case+" "+ans2);
        }
	}
    static void dfs(int idx,int core, int cnt, int len, boolean[][] wire){
     
        if(idx==cnt){
        	 if(ans<core) {
             ans=core;
        	 ans2=len;
         	}else if(ans==core){
             ans2=Math.min(ans2,len);
         }
           return;
        }
        
        
	
		for(int j=0; j<4; j++) {
            int a=arr.get(idx)[0];
			int b=arr.get(idx)[1];
            boolean flag=true;
            int l=0;
    		while(true) {
    			a+=move[j][0];
    			b+=move[j][1];
    			if(a<0||b<0||a>=s||b>=s)break;
    			if(pro[a][b]==1||wire[a][b]){
    				flag=false;
    				break;
    			}else {
    				wire[a][b]=true;
    				l+=1;
    			}
    		}

    		if(flag) {
    			dfs(idx+1,core+1,cnt,len+l,wire);
            }
    		a=arr.get(idx)[0];
			b=arr.get(idx)[1];
            for(int i=0; i<l; i++){
                a+=move[j][0];
    			b+=move[j][1];
            	wire[a][b]=false;
            }
		}
		dfs(idx+1,core,cnt,len,wire);
    }
}