import java.util.*;
public class lab6_7{
    public static void main(String[] args) {
        Time t1 = new Time(2,5);
        Time t2 = new Time(3,4);

        System.out.println("hh:mm="+t1.hh+":"+t1.mm);
        t1.addTime(t1, t2);

    }
}

class Time{
    int hh;
    int mm;

    Time(){
        hh=0;
        mm=0;
    }

    Time(int hh,int mm){
        this.hh=hh;
        this.mm=mm;
    }

    void addTime(Time t1,Time t2){
        t1.hh=t1.hh+t2.hh;
        t1.mm=t1.mm+t2.mm;
        System.out.println("hh:mm="+t1.hh+":"+t1.mm);
    }

}