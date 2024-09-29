import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[][] candy = new String[size][size];
        int output = 0;
        for (int i = 0; i < size; i++) {
            String str = reader.readLine();
            for (int u = 0; u < size; u++) {
                candy[i][u] = str.split("")[u];
            }
        }
        if (output < eat(candy, size)) {
            output = eat(candy, size);
        }
        String temp;
        for (int i = 0; i < size; i++) {
            for (int u = 0; u < size; u++) {
                if (u != size - 1 && !candy[i][u].equals(candy[i][u + 1])) {
                    temp = candy[i][u];
                    candy[i][u] = candy[i][u + 1];
                    candy[i][u + 1] = temp;

                    if (output < eat(candy, size)) {
                        output = eat(candy, size);
                    }

                    temp = candy[i][u + 1]; // 원래 상태로 복구
                    candy[i][u + 1] = candy[i][u];
                    candy[i][u] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int u = 0; u < size; u++) {
                if (u != size - 1 && !candy[u][i].equals(candy[u + 1][i])) {
                    temp = candy[u][i];
                    candy[u][i] = candy[u + 1][i];
                    candy[u + 1][i] = temp;

                    if (output < eat(candy, size)) {
                        output = eat(candy, size);
                    }

                    temp = candy[u + 1][i]; // 원래 상태로 복구
                    candy[u + 1][i] = candy[u][i];
                    candy[u][i] = temp;
                }
            }
        }

        System.out.println(output);
    }

    public static int eat(String[][] candy, int size) {
        int result = 0;
        int count;
     
        for (int i = 0; i < size; i++) {
            count = 1;
            for (int u = 0; u < size - 1; u++) {
                if (candy[i][u].equals(candy[i][u + 1])) {
                    count++;
                } else {
                    count = 1;
                }
                if (result < count) {
                    result = count;
                }
            }
        }

  
        for (int i = 0; i < size; i++) {
            count = 1;
            for (int u = 0; u < size - 1; u++) {
                if (candy[u][i].equals(candy[u + 1][i])) {
                    count++;
                } else {
                    count = 1;
                }
                if (result < count) {
                    result = count;
                }
            }
        }
        return result;
    }
}