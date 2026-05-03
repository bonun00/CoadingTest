import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int n;
    static char[][] bom;
    static boolean[][] visited;
    static int [][] move={{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			bom=new char[n][n];            
            
            for(int i=0; i<n; i++){
    			bom[i]=sc.next().toCharArray();              
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
 					if(bom[i][j]=='.'){
                    	find(i,j);                
                    }                             	
                }
            }
            visited=new boolean[n][n];
            int ans=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
 					if(bom[i][j]=='0'&&!visited[i][j]){
                    	bfs(i,j);                
                		ans++;
                    }                             	
                }
            }
     
			for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
 					if(bom[i][j]!='*'&&!visited[i][j]){
                 		ans++;           
                    }                             	
                }
            }
            System.out.println("#"+test_case+' '+ans);
            
		}
	}
    static void find(int a, int b){
 
 		int res=0;
		for(int i=0; i<8; i++){
            int ma=a+move[i][0];
            int mb=b+move[i][1];   
 			if(ma<0||mb<0||ma>=n||mb>=n) continue;
			if(bom[ma][mb]=='*')res++;            
        }
		bom[a][b]=(char)(res+'0');
    
    }

    static void bfs(int a, int b ){
         Queue<int[]> q=new ArrayDeque<>();
     	 q.add(new int[]{a,b});		
	      visited[a][b]=true;
        while(!q.isEmpty()){
        	int[] temp=q.poll();
		
	        for(int i=0; i<8; i++){
               	int ma=temp[0]+move[i][0];
                int mb=temp[1]+move[i][1];                 
              	if(ma<0||mb<0||ma>=n||mb>=n) continue;
                if(visited[ma][mb])continue;
                if(bom[temp[0]][temp[1]]=='0'){
                    visited[ma][mb]=true;
                 	q.add(new int[]{ma,mb});
                }
            }
        }
        
    
    }
    
}