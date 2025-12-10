
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int S=Integer.parseInt(br.readLine());
        String str =br.readLine();
    
        int answer=0;
   //     String ioi="I";
     //   for(int i=0;i<N;i++){
       //     ioi+="OI";
      //  }
        int count=0;


        int i=1;
        while(i<S-1){
            if (str.charAt(i - 1) == 'I' && str.charAt(i) == 'O' && str.charAt(i+1) == 'I') {

                count++;

                if(count==N){
                    answer++;
                    count--;
                }

                i+=2;
            }else{
                count=0;
                i+=1;
            }
        }



//        for(int i=0; i<S; i++){
//            if((str.charAt(i)+"").equals("I")){
//
//                if(i+ioi.length()-1>str.length()-1)continue;
////                System.out.println(ioi+" "+str.substring(i,i+ioi.length()));
//                if(ioi.equals(str.substring(i,i+ioi.length()))){
//                    answer++;
//                }
//            }
//
//        }
        System.out.println(answer);


    }


}


