import java.util.*;

public class L7P7 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        
        t1.getTime();
        t1.setTime(t1.hour, t1.minute);
        
        t2.getTime();
        t2.setTime(t2.hour, t2.minute);
        t2.addition(t1);
    }
}

class Time {
    int hour;
    int minute;
    
    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public void getTime() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Hours : ");
        hour = sc.nextInt();
        
        System.out.print("Enter Minutes : ");
        minute = sc.nextInt();
    }
    
    public void addition(Time t1) {
        this.hour += t1.hour;
        this.minute += t1.minute;
        
        System.out.println("Total Time : " + hour + "h " + minute + "m");
    }
}

