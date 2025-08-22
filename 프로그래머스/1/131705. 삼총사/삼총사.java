import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int n = number.length;
        int[] num = Arrays.copyOf(number, n);
        Arrays.sort(num);

        int answer = 0;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if (sum == 0) {
                    if (num[l] == num[r]) {
                        int cnt = r - l + 1;          // 같은 값 개수
                        answer += cnt * (cnt - 1) / 2; // 조합 C(cnt,2)
                        break;                         // l..r 모두 처리됨
                    } else {
                        int lc = 1, rc = 1;
                        while (l + 1 < r && num[l] == num[l + 1]) { lc++; l++; }
                        while (r - 1 > l && num[r] == num[r - 1]) { rc++; r--; }
                        answer += lc * rc;
                        l++; r--;
                    }
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return answer;
    }
}