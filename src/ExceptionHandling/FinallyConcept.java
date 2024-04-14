package ExceptionHandling;

public class FinallyConcept {
    public static void main(String[] args){
        try{
            int a = 0;
            int res = 10/a;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Important Statement!must be executed");
        }
    }
}
