import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        List<String> jip=new ArrayList<>();
        StringTokenizer st;
        String word;
        int j=0;
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < len; i++) {
             st= new StringTokenizer(reader.readLine());
            word= st.nextToken();
            if(word.equals("all")){
                j=(1<<21)-1;
            }else if (word.equals("empty")){
                j=0;
            }else{
                int num= Integer.parseInt(st.nextToken());
                if(word.equals("add")){
                    j|=(1<<num);
                } else if (word.equals("remove")) {
                    j&=~(1<<num);
                }else if(word.equals("check")){
                    sb.append((j&(1<<num))!=0 ? 1:0).append("\n");
                }else if(word.equals("toggle")){
                    j^=(1<<num);
                }

            }
            }
        System.out.println(sb);
        }
    }
