import java.util.*;

public class Rajvi{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        Stack s = new Stack(4);
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);
        //s.pop();
        //System.out.println(s.peep()); 
        s.display();
        s.change(); 
        s.display();
    }
}

class Stack{

    Scanner sc = new Scanner(System.in);
    
    int TOP;
    int i;
    int a[];

    Stack(int size){
          TOP = -1;
          a = new int[size];  
    }

    void push(int value){
        if(TOP>=a.length){
           System.out.println("Overflow");
        }
        else{
            TOP++;
            a[TOP]=value;
        }
    }

    int pop(){
         if(TOP <=0){
            System.out.println("Underflow");
            return -1;
         }
         else{
              int temp = a[TOP];
              TOP --;
              return temp;
         }
    }

    int peep(){
         if(TOP < 0){
            System.out.println("Underflow");
            return -1;
         }
         else{
              int temp = a[TOP];
              return temp;
         }
    }

    void change(){

        System.out.println("Enter index of number to be change: ");
        int ch = sc.nextInt();
        System.out.println("Enter new element: ");
        int n = sc.nextInt();

        if(TOP-ch<0){
            System.out.println("Stack Underflow");
        }
        else{
            a[TOP-ch] = n;            
        }
    }

    void display(){
        System.out.println("Elements in stack are: ");
        for(int i=TOP;i>=0;i--)
        {
        System.out.println(a[i]);
        }
    }
}