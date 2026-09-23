import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bombs = new int[n+1];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }

        while(true){
            boolean[] del = new boolean[n+1];
            boolean exploded = false;
            int same=1;
            for(int j=1; j<=n; j++){
                if(bombs[j-1]==bombs[j]){
                    same++;
                }else{
                    if(same>=m){
                        for(int i=j-same; i<=j-1; i++) del[i]=true;  
                        exploded = true;
                    }
                    same=1;
                }
            }
            if(!exploded) break;

            int[] temp = new int[n+1];
            int idx=0;
            for(int i=0; i<=n; i++){
                if(!del[i]) temp[idx++]=bombs[i];   
            }
            bombs = temp;
            n = idx-1;
        }

        System.out.println(n);
        for(int i=0; i<n; i++)System.out.println(bombs[i]);
    }
}