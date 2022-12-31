class ArrayDemo2{
    public static void main(String[] args){
        int[][] arr = {{1,2},{3,4},{5}};


        for(int[] v:arr){
            for(int x:v){
                System.out.println(x);
            }
        }
    }
}
