import javax.accessibility.AccessibleComponent;

public class jihe {
    public static void main(String[] args){
        Object []a={"aaa","abc", "ccc"};
        Object []b={"jdk","get","aaa"};
        Set set=new Set(a);
        Set set2=new Set(b);
        System.out.println(set.same(set2));
        System.out.println(set.union(set2));
        System.out.println(set.different(set2));

    }
    static class Set{
        Object []a;
        Set(Object []a){
            this.a=a;
        }
        String str;
        public String same(Set other){
            if(this.equals(other)){
                return "SAME";
            }
            return "NO";
        }
        public Object intersection(Set other){
            Object []c = new Object[10];
            int x=0;
            for(int i=0;i<(a.toString()).length();i++){
                for(int j=0;j<(other.toString()).length();j++){
                    if(a[i].equals(other.a[j])){
                        c[x]=a[i];
                        x++;
                    }
                }
            }
            return c;
        }
        public Object union(Set other){
           Object []c=new Object[10];
            int x=0;
            for(int i=0;i<a.toString().length();i++){
                for(int j=0;j<other.toString().length();j++){
                    if(a[i].equals(other.a[j])){
                        c[x]=a[i];
                        x++;
                    }
                }
            }
            for(int m=0;m<a.length;m++) {
                for (Object K : c) {
                    if (!a[m].equals(K)) {
                        c[x] = a[m];
                        x++;
                    }
                }
            }
                for(int n=0;n<other.a.length;n++){
                    for(Object K:c){
                        if(!other.equals(K)){
                            c[x]=other.a[n];
                            x++;
                        }
                    }
                }
           return c;
        }
        public Object different(Set other){
            Object []c=new Object[10];
            int x=0;
            for(int i=0;i<a.length;i++){
                if(other.toString().indexOf(a.toString().charAt(i))==-1){
                    c[x]=a[i];
                    x++;
                }
            }
            for(int j=0;j<other.toString().length();j++){
                if(a.toString().indexOf(other.toString().charAt(j))==-1){
                    c[x]=other.a[j];
                    x++;
                }
            }
            return c;
        }
        public void judge(Set other){
            int m=0;
            for(int i = 0;i<other.a.length;i++){
                if(a.toString().indexOf(other.toString().charAt(i))==-1){
                    str="不是子集";
                }
                m=i;
            }
            if (m==other.a.length-1){
                str="是子集";
            }
        }
        public String getStr(){
            return str;
        }
        public String toString(){
            return a.toString();
        }
    }
}
