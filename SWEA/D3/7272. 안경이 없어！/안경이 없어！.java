import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 구멍 1개인 문자들을 미리 정의 (비교 최적화)
        String hole1 = "ADOPQR";

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            boolean isSame = true;

            // 1. 길이가 다르면 무조건 DIFF
            if (s1.length() != s2.length()) {
                isSame = false;
            } else {
                // 2. 인덱스별로 구멍 개수 그룹이 같은지 확인
                for (int i = 0; i < s1.length(); i++) {
                    if (getGroup(s1.charAt(i), hole1) != getGroup(s2.charAt(i), hole1)) {
                        isSame = false;
                        break; // 하나라도 다르면 바로 탈출
                    }
                }
            }

            System.out.println("#" + test_case + " " + (isSame ? "SAME" : "DIFF"));
        }
    }

    // 각 문자의 구멍 개수 그룹을 반환하는 헬퍼 함수
    private static int getGroup(char c, String hole1) {
        if (c == 'B') return 2;
        if (hole1.indexOf(c) != -1) return 1;
        return 0;
    }
}