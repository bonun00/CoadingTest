

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command =reader.readLine();
        int num=Integer.parseInt(command.split(" ")[0]);
        int point=Integer.parseInt(command.split(" ")[1]);
        LinkedList <Integer> result=new LinkedList<>();
        LinkedList<Integer> list =new LinkedList<>();
        int index=0;
        for(int i=1; i<=num; i++){
            list.add(i);
        }
        while(list.size()!=0){
            index=(index+ point - 1)% list.size();
            result.add(list.get(index ));
            list.remove(index);
        }

        System.out.print("<");
    for (int i =0; i< result.size()-1; i++){
        System.out.print(result.get(i)+", ");
    }
        System.out.print(result.get(result.size()-1));
        System.out.print(">");

    }
}
