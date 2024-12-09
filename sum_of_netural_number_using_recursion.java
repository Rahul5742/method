import java.util.Scanner;
public class sum_of_netural_number_using_recursion {
    // logic sum of netural number .
    static int logic(int n){
        if(n==1){
            return 1;
        }
        return n+logic(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input .
        System.out.print("Enter number :");
        int number=sc.nextInt();
        //outout .
        System.out.println("This is your netural number sum of "+number+" number is : "+logic(number));

    }
}