
import java.util.*;
import java.io.*;

class Solution
{
    static char[][] battle;
    static int x;
    static int y;
    static int n;
    static int m;
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st=new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());
		    battle=new char[n][m];
            x=0;
            y=0;
            for(int i=0; i<n; i++){
            String temp=br.readLine();
                for(int j=0; j<m; j++){
                    
                	battle[i][j]= temp.charAt(j);

                    if(battle[i][j]=='<'||battle[i][j]=='^'||battle[i][j]=='>'||battle[i][j]=='v'){
                    	x=i;
                        y=j;
                    }
                }
                
            
                }
            
               int g=Integer.parseInt(br.readLine());
            String move=br.readLine();
            for(int i=0; i<g; i++){
               	char go=move.charAt(i);
            	play(go);
                
            }
            
                System.out.print("#"+test_case+" ");
                for(int i=0; i<n; i++){
                	for(char b: battle[i]){
                    	System.out.print(b);
                    }
                    System.out.println();
            }
		}
	}
    static void play( char go){
	
        switch(go){
            case 'U':
                if(x-1<0){
                battle[x][y]='^';
                    break;
                };
               	char now=battle[x-1][y];
                if(now=='*'||now=='#'||now=='-'){
                	battle[x][y]='^';
                    break;
                };
                
                battle[x][y]='.';
                battle[x-1][y]='^';
                x-=1;
                break;
            case 'D':
                if(x+1>=n){
                battle[x][y]='v';
                    break;
                };
               	now=battle[x+1][y];
                 if(now=='*'||now=='#'||now=='-'){
                	battle[x][y]='v';
                    break;
                };
                battle[x][y]='.';
                battle[x+1][y]='v';
                x+=1;
                break;
			case'R':
        		if(y+1>=m){
                battle[x][y]='>';
                    break;
                };
               	now=battle[x][y+1];
                 if(now=='*'||now=='#'||now=='-'){
                	battle[x][y]='>';
                    break;
                };
                battle[x][y]='.';
                battle[x][y+1]='>';
                y+=1;
                break;
            case 'L':
                if(y-1<0){
                battle[x][y]='<';
                    break;
                };
               	now=battle[x][y-1];
                 if(now=='*'||now=='#'||now=='-'){
                	battle[x][y]='<';
                    break;
                };
                battle[x][y]='.';
                battle[x][y-1]='<';
                y-=1;
                break;
            case 'S':
                switch(battle[x][y]){
                	case'^':
                        for(int i=x; i>=0; i--){
                        	if(battle[i][y]=='#') break;
                            if(battle[i][y]=='*') {
                            	battle[i][y]='.';
                                break;
                            }
                        }
                        break;
                    case'v':
                        for(int i=x; i<n; i++){
                        	if(battle[i][y]=='#') break;
                              if(battle[i][y]=='*') {
                            	battle[i][y]='.';
                                break;
                              }
                        }
                        break;
                    case'>':
                        for(int i=y; i<m; i++){
                        	if(battle[x][i]=='#') break;
                            if(battle[x][i]=='*') {
                            	battle[x][i]='.';
                                break;
                            }
                        }
                        break;
                    case'<':
                        for(int i=y; i>=0; i--){
                        	if(battle[x][i]=='#') break;
                            if(battle[x][i]=='*') {
                            	battle[x][i]='.';
                                break;
                            }
                        }
                        break;
                	
                }
        }
    
      
    }
 
    
    
}