import java.util.*;

public class Lab_practical {
    public static void main(String[] args) {
        time t1 = new time();
        t1.getTime();
        time t2 = new time();
        t2.getTime();
        time t3 = new time();
        t3.getTime();
        time t4 = new time();
        time.newTime(t1, t2, t3, t4);
        time.printTime(t4);
        
    }
}

class time{
    int hh;
    int mm;
    int ss;

    void getTime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hours:");
        hh=sc.nextInt();
        System.out.println("enter minutes:");
        mm=sc.nextInt();
        System.out.println("enter seconds:");
        ss=sc.nextInt();
    }
    
    static void newTime(time t1,time t2,time t3,time t4){
        t4.hh=t1.hh+t2.hh;
        t4.mm=t1.mm+t2.mm;
        t4.ss=t1.ss+t2.ss;

        t4.hh=t4.hh-t3.hh;
        t4.mm=t4.mm-t3.mm;
        t4.ss=t4.ss-t3.ss;

        if (t4.ss>60) {
            while (t4.ss>60) {
                t4.mm++;
                t4.ss-=60;
            }
        }
        if (t4.mm>60) {
            while (t4.mm>60) {
                t4.hh++;
                t4.mm-=60;
            }
        }
    }
    static void printTime(time t4){
        System.out.println("new time is ->"+" "+t4.hh+" "+t4.mm+" "+t4.ss);
    }
}