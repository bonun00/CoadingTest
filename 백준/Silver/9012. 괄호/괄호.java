
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.List;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            for (int i = 0; i < len; i++) {
                String line = reader.readLine();
                String[] parts = line.split("");
                List<String> arrayList = new ArrayList<>();
                for (String part : parts) {

                    if (part.equals("(")) {

                        arrayList.add(part);

                    } else if (part.equals(")") && arrayList.contains("(") && arrayList.size() > 0) {
                        arrayList.remove("(");
                    } else if (part.equals(")")) {
                        arrayList.add(part);
                        break;
                    }
                }
                if(arrayList.isEmpty()){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                }
    }

            }


