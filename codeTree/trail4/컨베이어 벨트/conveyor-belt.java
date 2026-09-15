import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }


        for(int i=0; i<t; i++){
            int tempT=top[n-1];
            int tempB=bottom[n-1];
            for(int j=n-1; j>0; j--){
                top[j]=top[j-1];
                bottom[j]=bottom[j-1];
            }

            top[0]=tempB;
            bottom[0]=tempT;
        }
        
        for(int a:top)System.out.print(a+" ");
        System.out.println();
        for(int a:bottom)System.out.print(a+" ");
       

       
    }
}