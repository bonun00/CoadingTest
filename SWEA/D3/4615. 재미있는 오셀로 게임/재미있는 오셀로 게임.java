
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static char[][] o;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            int m=sc.nextInt();
            o=new char[n][n];
            
            o[n/2-1][n/2-1]='W';
			o[n/2][n/2]='W';
			o[n/2-1][n/2]='B';
            o[n/2][n/2-1]='B';            
            
            for(int i=0; i<m; i++){
            	int x=sc.nextInt()-1;
                int y=sc.nextInt()-1;
                char r= sc.nextInt()==1? 'B':'W';
                o[x][y]=r;
            	game(x,y,r);    
            }
             
            int B=0;
            int W=0;
            for(int i=0; i<o.length; i++){
            	for(int j=0; j<o.length; j++){
                	if(o[i][j]=='B') B++;
                    if(o[i][j]=='W') W++;
                }
            }
            
 			System.out.println("#"+test_case+" "+B+" "+W);           
	
		}
   
        
        
        
	}
    
         public static void game(int a, int b, char r){
			
            int [][] move={{1,0},{0,1},{-1,0},{0,-1}, {-1,-1}, {1,1},{1,-1},{-1,1}};
            
            for(int i=0; i<8; i++){
                   boolean can=false;
                    int ma = a+move[i][0];
                    int mb = b+move[i][1];
                	int ta=ma;
                	int tb=mb;
                
                while(ta>=0&&tb>=0&&ta<o.length&&tb<o.length){
                    if(o[ta][tb]=='\u0000'){
                      break;
                    }
                   	if(o[ta][tb]==r){
                    	can=true;
                        break;
                    }
                    ta+=move[i][0];
                    tb+=move[i][1];
                
                }
                if(can){
 					while(o[ma][mb]!=r){
                    	o[ma][mb]=r;
                        ma+=move[i][0];
                		mb+=move[i][1];
                    }               	
                }     
              }
            }
}