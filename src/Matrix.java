import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter M value: ");
        int m = scanner.nextInt();
        System.out.println("Enter N value: ");
        int n = scanner.nextInt();
        int filler = random.nextInt(10);

        int[][] matrix1 = new int[m][n];
        int[][]matrix2 = new int[n][m];

        for(int i = 0; i<matrix1.length; i++){
            for(int j=0;j<matrix1[i].length;j++){
                matrix1[i][j]=filler++;

            }
        }
        System.out.println("Матриця: ");
        for(int i = 0; i<matrix1.length; i++){
            System.out.println(Arrays.toString(matrix1[i]));
        }

        for(int i = 0; i<matrix2.length; i++){
            for(int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=matrix1[j][i];
            }
        }
        System.out.println("Транспортована матриця: ");
        for (int i = 0; i<matrix2.length; i++){
            System.out.println(Arrays.toString(matrix2[i]));
        }
scanner.close();
    }


}
