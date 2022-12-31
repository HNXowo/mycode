public class Demo1 {
    public static void main(String[] args){

        char[] chArr = {'a','b','c','B','A'};
        for(int i = 0; i < chArr.length;i++){
            if(chArr[i]>='a'){
                chArr[i] = (char)(chArr[i]-('a'-'A'));
            }

        }
        for(char x:chArr){
            System.out.println(x);
        }
    }
}
