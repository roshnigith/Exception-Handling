package ExceptionHandling;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] arr = new int[5];
        try{
            int res = 10/n;
            for(int i = 0;i <= 5;i++){
                arr[i] = i;
                System.out.println(arr[i]);
            }
        }catch(ArithmeticException a){
            a.printStackTrace();
            System.out.println((a.getStackTrace())); //line no and other details in the exception
            System.out.println((a.getMessage()));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println((e.getMessage()));
        }catch(Exception e){ // Parent Exception
            System.out.println((e.getMessage()));
        }
        System.out.println("This is an important statement and should be printed");
    }
}