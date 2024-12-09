import java.util.Scanner;
public class sum_of_netural_number {
    //logic of netural number sum .
    static void logic(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;

        }
        System.out.println("This is your netural number sum of "+n+" number is : "+sum);
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