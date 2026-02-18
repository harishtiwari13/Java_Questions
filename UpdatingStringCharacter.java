import java.util.*;
public class UpdatingStringCharacter {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String t = j.nextLine();
        String g = "";
        
        //first way without inbuilt method
        for(int a = 0 ; a < t.length() ; a++){
            char ch = t.charAt(a);
            if(a == 0){
                int d = ch - 32;
                char p = (char) d;
                g += String.valueOf(p);
            }
            else{
                g += String.valueOf(ch);
            }
        }
        System.out.println("The Original String is: " + t);
        System.out.println("The Modified String is: " + g);
        // Second way
        String s = "";
        for(int b = 0 ; b < t.length() ; b++){
            char ht = t.charAt(b);
            if(b == 0){
                s += String.valueOf(Character.toUpperCase(ht));
            }
            else{
                s += String.valueOf(ht);
            }
        }
        System.out.println("The Original String is : " + t);
        System.out.println("The Modified String In Second Way is: " + s);
    }
}