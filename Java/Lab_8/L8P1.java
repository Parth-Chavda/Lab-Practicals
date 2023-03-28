public class L8P1 {
    public static void main(String[] args) {
        This t1 = new This();
        
        t1.displayThis();
    }
}

class This {
    static int num;
    
    This() {
        this.num = 1;   
    }
    
    void displayThis() {
        System.out.println(num);
    } 
}
