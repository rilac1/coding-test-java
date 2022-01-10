import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        LinkedList<Character> answer = new LinkedList<>();

        int cnt = 1;
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(bf.readLine());
            while (cnt<=num) {
                stack.push(cnt++);
                answer.add('+');
            }
            if (stack.peek()==num) {
                stack.pop();
                answer.add('-');
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        for (char ans : answer)
            System.out.println(ans);
    }
}