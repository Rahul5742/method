public class method_overloading {

    static void foo(){                               //foo(perameter):
        System.out.println("good morning bro:");

    }
    //This is perameter :

    static void foo(int a){                          //foo(int a is perameter):
        System.out.println("good morning "+a+" bro");

    }
    static void foo(int a,int b){                     //foo(int a and b is perameter):
        System.out.println("good morning "+a+" bro");
        System.out.println("good morning "+b+" bro");

    }

    public static void main(String[] args) {
        System.out.println("Method overloading :");

        // This is aargument :

        foo();                                          //foo (Arrgument) :

        foo(3000);                                  //foo (3000 is Arrgument) :

        foo(2000,3000);                          //foo (2000 and 3000 is Arrgument) :
    }
}