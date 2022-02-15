import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr;
    static int ans;

    static void back(int left, int sum, int len) {
        if (len==3)
            ans = Math.max(ans, sum);
        else {
            for (int i=left; i<N; i++)
                if (sum+arr[i]<=M)
                    back(i+1, sum+arr[i], len+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        arr = new int[N];
        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        ans = 0;
        back(0,0,0);
        System.out.println(ans);
    }
}