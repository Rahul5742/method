public class variable_argument_varargs_atleast_1_int {

    static int logic(int b,int...arr) {
        int sum = b;
        for (int a : arr) {
            sum += a;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("This is varargs :");
        System.out.println("Atleast 1 int compalsory :"+logic(2));
        System.out.println("This is your sum :"+logic(2,3));
        System.out.println("This is your sum :"+logic(2,3,4));
        System.out.println("This is your sum :"+logic(2,3,5,5));
        System.out.println("This is your sum :"+logic(2,3,4,4,3));


    }

}

