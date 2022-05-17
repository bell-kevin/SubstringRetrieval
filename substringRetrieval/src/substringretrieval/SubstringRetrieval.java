/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substringretrieval;
import java.util.Scanner;
/**
 *
 * @author 4800590195
 */
public class SubstringRetrieval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner computerKeyboardInput = new Scanner(System.in);
        String candide = "we must cultivate our garden";
        System.out.println(candide.substring(8));
        System.out.println(candide.substring(3, 17));
    }
    
}
