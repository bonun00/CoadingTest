
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int[][] miro;
    static int[] start;
    static int ans;
    static boolean[][] visited;
    static int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
            start=new int[2];
            miro=new int [16][16]; 
            visited=new boolean[16][16];
            ans=0;
            for(int i=0; i<16; i++){
            	String[] str =sc.next().split("");
                for(int j=0; j<16; j++){
                    miro[i][j]=Integer.parseInt(str[j]);
                    if(miro[i][j]==2){
                    	start[0]=i;
                        start[1]=j;
                    }
                }
            }
            
            
            dfs(start);
            
            System.out.println("#"+test_case+" "+ans);
           
            
            

		}
	}
    
    public static void dfs(int[] s){
        int x=s[0];
        int y=s[1];
    	if(miro[x][y]==1) return;
        if(visited[x][y])return;
        visited[x][y]=true;
		if(miro[x][y]==3){
        	ans=1;
            return;
        }
        for(int i=0; i<4; i++){
        	int mx=x+move[i][0];
            int my=y+move[i][1];
            if(0>mx|| 0>my||16<=mx||16<=my)continue;
            dfs(new int[]{mx, my});
        }
    }
}