
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            ArrayList<String> command= new ArrayList<>();
            for (int i = 0; i < len; i++) {
                String line = reader.readLine();
                String[] parts = line.split(" ");
                StringBuffer result = new StringBuffer();
                for(String part: parts){
                    StringBuffer rr =new StringBuffer(part);
                    result.append(rr.reverse().toString()).append(" ");
                }

                System.out.println(result);
                }



            }
            }



