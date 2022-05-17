package substringretrieval;

import java.util.Scanner;

public class SubstringRetrieval {
    
    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        String candide = "we must cultivate our garden";
        System.out.println(candide.substring(8));
        System.out.println(candide.substring(3, 17));
    }  
}
