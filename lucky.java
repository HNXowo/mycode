import java.util.Scanner;
public class lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            if(ndigit(b)==0){
                if(x==0){
                    x=b;
                }
            }

        }
        if(x!=0)
            System.out.println(x);
        if(x==0)
            System.out.println("No");
    }
        static int ndigit ( int i){
            String k = String.valueOf(i);
            int m = k.length();
            for (int a = 1; a <= m; a++) {
                if (i % 10 == 8) {
                    return 0;
                }
                i = i / 10;
            }

            return 1;
        }
    }
