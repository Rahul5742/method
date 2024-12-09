import java.util.Scanner;
public class table {
    // logic of multiplication table .
    static void logic(int n){
        for (int i = 1; i <=10; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args) {
        // input .
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter number :");
        int number=sc.nextInt();
        //output .
        logic(number);
    }
}
