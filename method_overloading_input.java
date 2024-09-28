import java.util.Scanner;

public class method_overloading_input {


    static int logic(int a,int b){
        return a+b;
    }

    static void logic() {
        System.out.println("good morning :");
    }
    static void logic(int a) {
        System.out.printf("good morning %d :", a);
    }
    static void logic(int a, int b,int d) {
        System.out.printf("good morning %d :", a);
        System.out.printf("good morning %d :", b);
        System.out.printf("good morning %d :", d);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a :");
        int a=sc.nextInt();
        System.out.print("Enter b :");
        int b=sc.nextInt();
        System.out.print("Enter d :");
        int d=sc.nextInt();
        int c=logic(a,b);
        System.out.println("This is your sum :" +c);

        logic();
        logic(a);
        System.out.println();

        logic(b);
        System.out.println();
        logic(d);
        System.out.println();
        logic(a,b,d);
    }
}