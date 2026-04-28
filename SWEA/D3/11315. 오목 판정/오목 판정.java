
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    
     static int[][] move={{1,0},{0,1},{1,0},{0,1},{1,1},{-1,-1},{1,-1},{-1,1}};
	static char[][] om;
    static boolean ans;
    static int n;
    public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
            
            om= new char[n][n];
            ans=false;
			for(int i=0; i<n; i++){
            	om[i]=sc.next().toCharArray();
            }
		
            for(int a=0; a<n; a++){
            	for(int b=0; b<n; b++){
                	if(om[a][b]=='o'){
                    	 for(int i=0; i<8; i++){
            				dfs(a,b,move[i],1);        				 
                         }
                    
                    }                
                }
            }
            
            System.out.println("#"+test_case+" "+(ans?"YES":"NO"));
            
		}
	}
    public static void dfs(int x, int y, int[] m, int depth){
     			if(depth==5){
                	ans=true;
                    return;
                }
       			int mx=x+m[0];
        		int my=y+m[1];
        		if(mx<0||my<0||mx>=n||my>=n)return;
        
           		if(om[mx][my]=='o'){
    				dfs(mx,my,m,depth+1);						             	              
                }

        	
    	    
        }
        
    
    
    
    }
    
    
