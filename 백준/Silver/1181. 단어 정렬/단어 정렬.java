import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());

        List <String> list = new ArrayList();
        HashSet hash = new HashSet();
        for (int i = 0; i < len; i++) {
            hash.add(reader.readLine());
        }

        Iterator<String> iter = hash.iterator();
        while(iter.hasNext()){
            list.add(iter.next());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1,String o2){
                if (o1.length()>o2.length())return 1;
                else if(o1.length()<o2.length())return -1;
                else{
                    int word=o1.compareTo(o2);
                    return word;
                }
            }
        });
        for(String s :list){
            System.out.println(s);
        }

    }
}