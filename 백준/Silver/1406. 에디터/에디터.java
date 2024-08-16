
    import javax.swing.text.Style;
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.LinkedList;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            StringBuilder sb= new StringBuilder(str);
            int len = Integer.parseInt(reader.readLine());
            int index = sb.length();

            for(int i=0; i <len; i++){
                String command = reader.readLine();
                char word= command.charAt(0);
                if (word== 'P') {
                    sb.insert(index,command.charAt(2));
                    index++;
                }else if (word=='B'){
                    if(index==0){
                        continue;
                    }
                    sb.deleteCharAt(index-1);
                    index--;
                }else if (word=='D'){
                    if(index==sb.length()){
                        continue;
                    }
                    index++;
                } else if (word=='L') {
                    if(index==0){
                        continue;
                    }
                    index--;
                }
            }
            System.out.print(sb);
            }
        }


