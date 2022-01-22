import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++)
            a[i] = sc.nextInt();
        
        int sum = a[0];   
        int l,r,cnt;
        l = r = cnt = 0;
        while (true) {
            if (sum>M)
                sum -= a[l++];
            else {
                if (sum==M) cnt++;
                if (++r == N) break;
                sum += a[r];
            }
        }
        System.out.println(cnt);
    }
}
