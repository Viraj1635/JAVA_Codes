import java.util.*;
public class Lab_Task {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.GetArray();
        d.Check();
        
    }
}

class Demo{
    int a[]= new int[10];
    public void GetArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array:");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
    }
    public void  Check(){
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}