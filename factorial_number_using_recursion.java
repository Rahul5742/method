import java.util.Scanner;
public class factorial_number_using_recursion {
    //logic of recursion .
    static int logic(int n){
        if(n==1){
            return 1;
        }
        return n*logic(n-1); //factorial logic
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // input factorial number .
        System.out.print("Enter number :");
        int number=sc.nextInt();
        //output .
        System.out.println("This is your factorial of "+number+" :"+logic(number));
    }
}
