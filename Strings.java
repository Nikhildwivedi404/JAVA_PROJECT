import java.util.*;
public class Strings {
    public static void main(String[] args) {
        //concatenation
        // String firstName = "nikhil";
        // String lastName = "dwivedi";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }


        //compare
        // String name1 = "nikhil";
        // String name2 = "nikhil";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value


        // if(name1.compareTo(name2) ==0){
        //     System.out.println("Strings are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }


        // if(name1 == name2){
        //     System.out.println("Strings are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }





        // if(new String("nikhil") == new String("nikhil")){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("String are NOT equal");
        // }



        String sentence = "nikhilDwivedi";
        String name = sentence.substring(0,6);
        System.out.println(name);


    }
}
