import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of first matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns of first matrix and number of rows of second matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns of second matrix: ");
        int o = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][o];

        System.out.println("Enter elements in matrix A:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("Enter element at A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter elements in matrix B:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<o; j++) {
                System.out.print("Enter element at B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix B:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<o; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        int[][] C = new int[m][o];
        for(int i=0; i<m; i++) {
            for(int j=0; j<o; j++) {
                for(int k=0; k<n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix C after multiplication:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<o; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
