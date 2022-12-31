public class hebing {
    public static void main(String[] args) {
        int[] a1 = {15,20,30, 40, 55,60,75,80};
        int[] a2 = {15, 20, 40, 80, 100};
        int[] a3 = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int j = 0; j < a2.length; j++) {
            a3[a3.length - j - 1] = a2[a2.length - j - 1];
        }

        for (int i = 1; i < a3.length; i++) {
            if (a3[i - 1] > a3[i]) {
                int tmp = a3[i];
                int j = i - 1;
                do {
                    a3[j + 1] = a3[j];
                    j--;
                } while (j >= 0 && tmp < a3[j]);
                a3[j + 1] = tmp;
            }
        }
        for(int i=0;i<a3.length-1;i++){
            if(a3[i]==a3[i+1]){
                for(int j=i+1;j<a3.length-1;j++){
                    a3[j]=a3[j+1];
                }
            }
        }
        for (int i=0;i<a3.length-1;i++) {

            System.out.println(a3[i]);
            if(a3[i+1]==a3[i]){
                break;
            }

        }
    }
}