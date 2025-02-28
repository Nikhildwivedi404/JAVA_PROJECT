import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int [3];
        // marks[0] = 40;
        // marks[1] = 50;
        // marks[2] = 60;
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }


        // int marks[] = {40, 50, 60};

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }



        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // //inout
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }


        // //output
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }



/////   linear search

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //inout
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }


        int x = sc.nextInt();


        //output
        for(int i=0; i<size; i++){
            if(numbers[i]== x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}
    
    
