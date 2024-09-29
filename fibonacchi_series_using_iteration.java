import java.util.Scanner;

public class fibonacchi_series_using_iteration {
    static void logic(int n){
        //logic of iteration : fibonacchi series.
        int a=0,b=1,c;
        for (int i = 0; i <=n ; i++) {
            c=a+b;
            a=b;
            b=c;
            c=a;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("iteration on fibonacchi series ");
        System.out.print("Enter your number :");

        //output :
        int n=sc.nextInt();
        logic(n);
    }
}

//   fibonacchi series sample : 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ,..........

//   Default 0 , 1 :
//       0 + 1 = 1
//           1 + 1 = 2
//               1 + 2 = 3
//                   2 + 3 = 5
//                       3 + 5 = 8
//                           5 + 8 = 13
//                               8 + 13 = 21


