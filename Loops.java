import java.util.*;
public class Loops {
    public static void main(String[] args) {
        // for(int counter = 0; counter < 5; counter = counter + 1){
        //     System.out.println("nikhil");
        // }

        // for(int i = 0; i < 15; i++){
        //     System.out.println(i);
        // }

        // int i = 0;
        // while (i < 11 ) {
        //     System.out.println(i);
        //     i = i + 1; //i++;
        // }

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i = i + 1;

        // } while(i < 11);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    //     int sum = 0;
    //     for(int i=0; i<=n; i++){
    //         sum = sum + i;
    //     }

    //     System.out.println(sum);
    // } 
        for(int i=1; i<= 10; i++){
            System.out.println(i*n);
        }
    }
}
