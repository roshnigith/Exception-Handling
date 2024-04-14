package ExceptionHandling;

import java.sql.SQLOutput;

public class ThrowsKeyword {
    public static void main(String[] args) {
        try{
            method1();
            method2();
            method3();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void method1() throws Exception {
        int b = 0;
        int res = 10/b;

    }

    public static void method2()throws Exception {
        int a = 0;
        int res = 10/a;
    }

    public static void method3() throws Exception{
        int a = 0;
        int res = 10/a;
    }
}
