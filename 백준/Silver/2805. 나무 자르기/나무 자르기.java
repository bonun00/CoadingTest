
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int n= Integer.parseInt(st.nextToken());
            int len= Integer.parseInt(st.nextToken());
            int[] tree =new int[n];
            int maxH=0;
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            for (int i = 0; i <n; i++) {
                tree[i] = Integer.parseInt(st2.nextToken());
                if(tree[i]>maxH)maxH=tree[i];
            }
            long temp=0;
            int l=0;
            int r=maxH;
            int mid;
            int answer=0;
            while(l<=r){
                mid =(r+l)/2;
                for(int i=0; i<n;i++){
                    if(tree[i]-mid>0)temp+=(tree[i]-mid);
                }
                 if(temp>=len){
                    answer=mid;
                    l=mid+1;
                    temp=0;
                }else{
                    r=mid-1;
                    temp=0;
                }
            }
        System.out.println(answer);









    }
}
