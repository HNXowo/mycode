import java.util.Arrays;
import java.util.Set;

public class jihe2 {
    public static void main(String[] args){

    }
    static class Set{
        char[] data;
        int num;
        Set(int len){
            data=new char[len];
            num=0;
        }
        Set(char[] arr){
            data=arr;
            num=arr.length;
        }
        Set add(Set oth){
            Set r=new Set(this.num+ oth.num);        /* 再看看 */
            oth.copy(r);
            for(int i=0;i<num;i++){
                r.insert(data[i]);
            }
            return r;
        }
        Set intersection(Set oth){
            Set r=new Set(this.num);
            for(int i=0;i<this.num;i++){
                if(oth.indexOf(this.data[i])>=0)
                    r.insert(data[i]);
            }
            return r;
        }
        void copy(Set des){
            System.arraycopy(this.data,0,des.data,0,num);
            des.num=this.num;
        }
        void insert(char e){
            if(this.indexOf(e)!=-1)
                return;
            data[num]=e;
            num++;
        }
        int indexOf(char e){
            for (int i=0;i<num;i++){
                if (data[i]==e)
                    return i;
            }
            return -1;
        }
    }
}
