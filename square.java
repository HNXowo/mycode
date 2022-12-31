import java.util.Scanner;
public class square {
    public static void main(String[] args){
        System.out.println("请输入a,b,c三个数字来决定两个矩阵的大小！");
        System.out.println("axb为第一个矩阵，bxc为第二个矩阵！");
        System.out.println("axb中a为行数，b为列数，bxc中b为行数，c为行数");
        Scanner sc = new Scanner(System.in);
        int i, j, k, m, n;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("接下来请对两个数组填入数值！");
        int[][] A = new int[a][b];
        int[][] B = new int[b][c];
        int[][] result = new int[A.length][B[0].length];
        for (m = 0; m < A.length; m++) {
            for (n = 0; n < A[0].length; n++) {
                A[m][n] = sc.nextInt();
            }
        }
        for (m = 0; m < B.length; m++) {
            for (n = 0; n < B[0].length; n++) {
                B[m][n] = sc.nextInt();
            }
        }
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < B[0].length; j++) {
                for (k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("矩阵AxB的结果是：");
        for(i=0;i<result.length;i++){
            for(j=0;j<result[i].length;j++){
                System.out.printf("%8d",result[i][j]);
            }
            System.out.println();
        }
    }
}


