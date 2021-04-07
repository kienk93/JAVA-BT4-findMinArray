import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n hàng");
        int n = sc.nextInt();
        System.out.println("nhập m cột");
        int m = sc.nextInt();
        int[][] mang1 = new int[n][m];
        for (int i = 0; i < mang1.length; i++) {
            for (int j = 0; j < mang1[i].length; j++) {
                System.out.print("nhập giá trị " + i + "," + j + ": ");
                mang1[i][j] = sc.nextInt();
            }
        }
        int min = mang1[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < mang1.length; i++) {
            for (int j = 0; j < mang1[i].length; j++) {
                if (mang1[i][j] < min) {
                    min = mang1[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.print("Mảng có giá trị min =" + min + "tại vị trí: " + a + "," + b);
    }

}