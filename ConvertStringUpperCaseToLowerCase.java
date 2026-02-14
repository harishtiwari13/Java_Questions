import java.util.*;
public class ConvertStringUpperCaseToLowerCase {
    public static void tony(String s){
        String t = "";
        for(int b = 0 ; b < s.length() ; b++){
            char ch = s.charAt(b);
            int d  = ch;
            if(d >= 65 && d <=90){
                char k = (char) (ch + 32);
                t += String.valueOf(k);
            }
            else if(d >= 97 && d <= 122){
                t += String.valueOf(ch);
            }
            else{
                continue;
            }
        }
        System.out.println("The Changed String And Converted Into Lower Case is: " + t);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String g = j.nextLine();
        System.out.println("The Original String is: " + g);
        tony(g);
    }
}