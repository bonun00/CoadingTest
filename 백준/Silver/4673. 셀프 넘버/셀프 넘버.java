
import java.io.IOException;
import java.util.ArrayList;


import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> notSafeNum=new ArrayList<>();
        for(int i=1; i<10000; i++){
            String str = Integer.toString(i);
            List<Integer> list = new ArrayList<>();
            for(int k=0; k<str.length(); k++) {
                list.add(Integer.parseInt(str.split("")[k]));
            }
            int temp=i;
            for(int k=0; k<str.length(); k++) {
                temp += list.get(k);
            }
            if(!notSafeNum.contains(temp)){
                notSafeNum.add(temp);
            }

        }
        for(int i=1; i<10000; i++) {
            if (!notSafeNum.contains(i)) {
                System.out.println(i);
            }
        }
    }

}



