
import java.util.*;
public class conditions {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age > 18){
        //     System.out.println("valid out");
        // }
        // else {
        //     System.out.println("not valid out");
        // }


        // Scanner sc =  new Scanner(System.in);
        // int x = sc.nextInt();

        // if(x % 2 == 0){
        //     System.err.println("Even");

        // }
        // else{
        //     System.out.println("odd");
        // }


        // Scanner sc =  new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("Equal");
        // }else if (a > b) {
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("a is lesser");
        // }



        // Scanner sc =  new Scanner(System.in);
        // int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // } else if(button == 2){
        //     System.out.println("hii");
        // } else if(button == 3){
        //     System.out.println("nikhil");
        // }else{
        //     System.out.println("Invalid Button");
        // }

    //     switch (button) {
    //         case 1: System.out.println("nikhil");
    //             break;
    //         case 2: System.out.println("hello");
    //             break;
    //         case 3:  System.out.println("hii");
    //             break;
    //         default: System.out.println("Invalid Button");
    //             break;
    //     }




        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();

        /**
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */


        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a/b);
                    }
        break;
            case 5 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a%b);
                    }
        break;
            default : System.out.println("Invalid Operator");
        }
    }
}
