package ExceptionHandling;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            int res = 10/n;
        }catch(ArithmeticException a){
            System.out.println("Divide by zero error");
        }
        System.out.println("This is an important statement and should be printed");
    }
}