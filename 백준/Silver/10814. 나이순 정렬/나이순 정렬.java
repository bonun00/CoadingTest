
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Map;
    import java.util.StringTokenizer;
    import java.util.TreeMap;
    import java.util.List;

    public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,List<String>> map = new TreeMap<>();
        int n = Integer.parseInt(reader.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(reader.readLine());

            map.computeIfAbsent(Integer.parseInt(st.nextToken()),k -> new ArrayList<>()).add(st.nextToken());
        }

        for(int num:map.keySet()){
            int temp=map.get(num).size();
            for(int i=0;i<temp;i++){
                System.out.println(num+" "+map.get(num).get(i));
            }
        }





    }
}
