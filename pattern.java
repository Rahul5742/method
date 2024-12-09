import java.util.Scanner;
public class pattern {
    //logic of pattern .
    static void logic(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
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