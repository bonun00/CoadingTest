    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            int[] freq=new int [8001];
            double hap = 0;
            for (int i = 0; i < len; i++) {
                hap += list.get(i);
                freq[list.get(i)+4000]++;
            }
            hap= hap/len;
            System.out.println(Math.round(hap));
            Collections.sort(list);
            System.out.println(list.get(len / 2));

            boolean flag=false;
            int maxfreq=0;
            int mode=0;

            for(int i=0; i <8001; i++){
                if(maxfreq<freq[i]){
                   maxfreq=freq[i];
                   mode= i -4000;
                   flag=true;
                }else if(maxfreq==freq[i]&& flag){
                    flag=false;
                    mode=i-4000;
                }
            }
            System.out.println(mode);
            System.out.println(list.get(len-1)-list.get(0));
        }
    }