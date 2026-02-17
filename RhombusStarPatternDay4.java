import java.util.*;
public class RhombusStarPatternDay4 {
    public static void stark(int rows){
        for(int a = 0 ; a <= rows ; a++){
            for(int space = 1 ; space <= a  ; space++){
                System.out.print(" "); 
            }
            for(int b = 1 ; b <= rows ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int num = j.nextInt();
        System.out.println("The Original Rows is: " + num);
        stark(num);
    }
}