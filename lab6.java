import java.util.*;
public class lab6 {
    public static void main(String[] args) {
        Student s1 = new Student(148,"viraj",'M',80);
        s1.display();
    }
}

class Student{
    int enno;
    String name;
    char gender;
    int marks;
    static int count;

    Student(int e,String n,char g,int m){
        enno=e;
        name=n;
        gender=g;
        marks=m;
        count++;
    }

    public void display(){
        System.out.println(enno+" "+name+" "+gender+" "+marks+" "+count);
    }
}
