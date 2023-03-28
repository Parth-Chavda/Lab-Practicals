public class L7P8 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(3,4);
        
        c1.addition(c2);
        
    }
}

class Complex {
    int real;
    int imgn;
    
    Complex() {
        this.real = 1;
        this.imgn = 1;
    }
    
    Complex(int real, int imgn) {
        this.real = real;
        this.imgn = imgn;
    }
    
    public void addition(Complex c) {
        this.real += c.real;
        this.imgn += c.imgn;
        
        System.out.println("Addition : "+ real + " + " + imgn + "i");  
    }
}
