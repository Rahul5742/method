public class array_case_and_normal_case_of_method{
        static void logic(int a) {
            a = 45;
        }
        static void logic2(int [] arr) {
            arr[0] = 97;
        }

        public static void main(String[] args) {
            //Normal case:
            int b=85;
            logic(b);
            System.out.println("This not change :"+b);

            //Array case:
            int []arr={87,45,34};
            logic2(arr);
            System.out.println("This is change :"+arr[0]);

        }
    }
