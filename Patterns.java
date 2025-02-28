import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        // int n = 4;
        // int m = 5;

        // Solid Rectangle

        // Outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++);
        //     System.out.print("*");
        // }
        // System.out.println();
        //}


        // Hollow Rectangle
        // outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++){
        //         //cell -> (i,j)
        //         if(i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Half Pyramid
        //outer loop
                // int n= 4;
                // for(int i=1; i<=n; i++){
                //  //inner loop
                // for(int j=1; j<=i; j++){
                //     System.out.print("*");
                //      }
                //      System.out.println();
                //     }

        // Inverted Half Pyramid
           //outer loop

            // int n= 4;
            // for(int i=n; i>=1; i--){
            
            //  //inner loop
            
            // for(int j=1; j<=i; j++){
            
            //     System.out.print("*");
            
            //     }
            
            //     System.out.println();
            
            //}

        // Inverted Half Pyramid (rotated by 180deg)
            // outer loop
            // int n = 4;
            // for(int i=1; i<=n; i++){
            //     //inner loop -> space print
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }

            //     // inner loop -> star print
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        // Half Pyramid with Numbers
            // int n = 5;

            // // outer loop
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }
            
        //Inverted Half Pyramid with Numbers
            // int n =5;

            // // outer loop
            // for(int i=1; i<=n; i++){
            //     //inner loop
            //     for(int j=1; j<=n-i+1; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
        //floyd's Triangle
            // int n =5;
            // int number = 1;
            //     // outer loop
            //     for(int i=1; i<=n; i++){
            //         //inner loop
            //         for(int j=1; j<=i; j++){
            //             System.out.print(number+" ");
            //             number++;//number = number + 1
            //         }
            //         System.out.println();
            //     }

        // 0-1 Triangle
            // int n = 5;
            //     //outer loop
            //     for(int i=1; i<=n; i++){
            //         //inner loop
            //         for(int j=1; j<+i; j++){
            //             int sum= i+j;
            //             if(sum % 2 == 0){ //even
            //                 System.out.print("1 ");
            //             }else { //odd
            //                 System.out.print("0 ");
                            
            //             }
            //         }
            //         System.out.println();
            //     }

        // Butterfly Pattern
            // int n = 5;
            // //   upper half
            // for(int i=1; i<=n; i++){
            //     //1st part
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }

            //     //spaces
            //     int spaces = 2 * (n-i);
            //     for(int j=1; j<=spaces; j++){
            //         System.out.print(" ");
            //     }

            //     //2nd part
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // // lower half
            // for(int i=n; i>1; i--){
            //     //1st part
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }

            //     //spaces
            //     int spaces = 2 * (n-i);
            //     for(int j=1; j<=spaces; j++){
            //         System.out.print(" ");
            //     }

            //     //2nd part
            //     for(int j=1; j<=i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        // Solid Rhombus
            // int n= 5;
            // for(int i=1; i<=n; i++){
            //     //spaces
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }

            //     //stars
            //     for(int j=1; j<=5; j++){
            //         System.out.print("*");
            //     }
            //     System.err.println();
            // }
        // Number Pyramid
            // int n = 5;

            // for(int i=1; i<=n; i++){
            //     //spaces
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     //numbers - >print row no, row no times
            //     for(int j=1; j<=i; j++){
            //         System.out.print(i + " ");
            //     }
            //     System.out.println();
            // }
        
        // Palindromic Pattern
                // int n = 5;

                // for(int i=1; i<=n; i++){
                //     //spaces
                //     for(int j=1; j<=n-i; j++){
                //         System.out.print(" ");
                //     }

                //     //1st half numbers
                //     for(int j=i; j>=1; j--){
                //         System.out.print(j);
                //     }
                //     //2nd half numbers
                //     for(int j=2; j<=i; j++){
                //         System.out.print(j);
                //     }
                //     System.out.println();
                // }
        // Diamond Pattern

            int n = 4;

            //upper half
            for(int i=1; i<=n; i++){
                //spaces
                for(int j=1;j<=n-i; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //lower half
            for(int i=n; i>=1; i--){
                //spaces
                for(int j=1;j<=n-i; j++){
                    System.out.print(" ");
                }

                //stars
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
