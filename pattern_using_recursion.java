import java.util.Scanner;
public class pattern_using_recursion {
    //logic of pattern using recursion .
    static void logic(int n){
        if(n==1){
            System.out.println(" *  ");
            return ;
        }
        logic(n-1);
        for (int i = 1; i <=n ; i++) {
            System.out.print(" *  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input .
        System.out.print("Enter number :");
        int number=sc.nextInt();
        //outout .
        logic(number);

    }
}