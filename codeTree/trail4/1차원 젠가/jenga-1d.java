import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        int s1 = sc.nextInt()-1;
        int e1 = sc.nextInt()-1;
        int s2 = sc.nextInt()-1;
        int e2 = sc.nextInt()-1;

        int[] temp=new int [n];
        int len=blocks.length;
        for(int i=0; i<len; i++){
            if(s1<=i&&i<=e1)continue;
            temp[i]=blocks[i];
        }
        len-=(e1-s1+1);

        int idx=0;
        blocks=new int[len];
        for(int i=0; i<temp.length; i++){
            if(temp[i]>0){
                blocks[idx++]=temp[i];
   
            }
        }
        temp=new int [n];
        for(int i=0; i<len; i++){
            if(s2<=i&&i<=e2)continue;
            temp[i]=blocks[i];
        }
        idx=0;
        len-=(e2-s2+1);
        blocks=new int[len];
        for(int i=0; i<temp.length; i++){
            if(temp[i]>0){
                blocks[idx++]=temp[i];
            }
        }

        System.out.println(len);
        for(int i=0; i<len; i++)System.out.println(blocks[i]);


    }
}