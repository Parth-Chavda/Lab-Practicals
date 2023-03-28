public class Method{
    public static void main(String[] args){
        int a=add();
        int b=add(5,2);
        int c=add(3,4,5);
        System.out.println(c);
    }
    static int add(){
        int c=0;
        return c;
    }
    static int add(int a,int b){
        int c=a+b;
        return c;
    }
    static int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
}
