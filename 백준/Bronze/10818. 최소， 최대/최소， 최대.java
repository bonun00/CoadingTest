    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.List;


    public class Main {
        public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            String[] parts = reader.readLine().split(" ");
            ArrayList<String> line = new ArrayList<>(List.of(parts));
            int max =-1000000;
            int min =100000;

            for(int i =0; i<len; i++){
                int currentValue= Integer.parseInt(line.get(i));
                if(max < currentValue){
                    max=currentValue;
                }
                if(min> currentValue){
                    min= currentValue;
                }

            }
            System.out.print(min + " " + max);

            }
        }
