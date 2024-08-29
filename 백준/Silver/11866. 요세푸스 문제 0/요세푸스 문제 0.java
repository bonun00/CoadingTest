import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int len = Integer.parseInt(input.split(" ")[0]);
        int num = Integer.parseInt(input.split(" ")[1]);
        int comm=0;
        List arr =new ArrayList<>();
        ArrayList result= new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=len; i ++){
            arr.add(i);
        }
        for(int i= 0; i<len; i++){
            comm=(comm+ num-1)%arr. size();
            sb.append(arr.remove(comm)).append(", ");
            
        }
       if(sb.length()>0){
	sb.setLength(sb.length()-2);	
	}
    	System.out.println("<"+sb.toString()+">");
	}
}