import java.util.ArrayDeque;
import java.util.Deque;


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        Deque<Integer> stack = new ArrayDeque<>();

        for(int curr_index = 0; curr_index < temperatures.length; curr_index++){
            
            while(!stack.isEmpty() && temperatures[curr_index] > temperatures[stack.peek()]){

                int prev_index = stack.pop();

                answer[prev_index] = curr_index - prev_index;
            }

            stack.push(curr_index);
        }
        return answer;
}
}