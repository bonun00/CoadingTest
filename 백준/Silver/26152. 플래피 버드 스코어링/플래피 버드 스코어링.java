
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] up = new int[n];
        int[] down = new int[n];

        StringTokenizer u = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            up[i] = Integer.parseInt(u.nextToken());
        }
        StringTokenizer d = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            down[i] = Integer.parseInt(d.nextToken());
        }


        int[] pref = new int[n];
        pref[0]=up[0]-down[0];
        for (int i = 1; i < n; i++) {
            int gap = up[i]-down[i];
            if (pref[i-1]<gap) {
                pref[i]=pref[i-1];
            }else{
                pref[i]=gap;
            }
        }

        int b=Integer.parseInt(reader.readLine());
        StringTokenizer s = new StringTokenizer(reader.readLine());
        for (int i = 0; i < b; i++) {
            int size = Integer.parseInt(s.nextToken());
            int l=0;
            int r=n;
            while (l<r) {
                int m = (l+r)/2;
                if(size<=pref[m]){
                    l=m+1;
                }else {
                    r = m;
                }
            }
            System.out.println(l);





        }










    }
}




