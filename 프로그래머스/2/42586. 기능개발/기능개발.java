import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> days = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (int) Math.ceil((double) remain / speeds[i]);
            days.offer(day);
        }

        while (!days.isEmpty()) {
            int current = days.poll();
            int count = 1;

            while (!days.isEmpty() && days.peek() <= current) {
                days.poll();
                count++;
            }

            result.add(count);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}