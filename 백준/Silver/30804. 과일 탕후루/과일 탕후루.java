
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.StringTokenizer;

    public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] fruit=new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            fruit[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int left=0,maxLen=0;
        for (int right = 0; right < n; right++) {
            map.put(fruit[right],map.getOrDefault(fruit[right],0)+1);
            while(map.size()>2){

                int x=fruit[left++];
                int c=map.get(x)-1;
                if(c==0)map.remove(x);
                else map.put(x,c);
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
}
