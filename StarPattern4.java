import java.util.*;
public class StarPattern4 {
    public static void main(String args[]) {
        int n, x, j, blank = 1;
        System.out.print("Enter the value for rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        blank = n - 1;
        for (j = 1; j <= n; j++) {
            for (x = 1; x <= blank; x++) {
                System.out.print(" ");
            }
            blank--;
            for (x = 1; x <= 2 * j - 1; x++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        blank = 1;
        for (j = 1; j <= n - 1; j++) {
            for (x = 1; x <= blank; x++) {
                System.out.print(" ");
            }
            blank++;
            for (x = 1; x <= 2 * (n - j) - 1; x++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
