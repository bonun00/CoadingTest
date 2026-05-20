
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            char chess[][]=new char[8][8];
            boolean[] x=new boolean[8];
            boolean[] y=new boolean[8];
            boolean ans=true;
			int cnt=0;
            for(int i=0; i<8; i++){
            	String str=br.readLine();
                chess[i]=str.toCharArray();
                for(int j=0; j<8; j++){
                   	if(!x[i]&&!y[j]&&chess[i][j]=='O'){
                    	x[i]=true;
                        y[j]=true;
                        cnt++;
                    }else if((x[i]||y[j])&&chess[i][j]=='O'){
                        ans=false;
                    }
              }
            }
            if(cnt!=8){
            	ans=false;
            }
            System.out.println("#"+test_case+" "+(ans?"yes":"no"));
			
		}
	}
}