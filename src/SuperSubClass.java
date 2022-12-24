/* A subclass must come before its superclass in a series of catch statements.
If not unreachable code will be created and a compile-time error will result.
 */

public class SuperSubClass {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        } catch (Exception e){
            System.out.println("Generic exception catch.");
        }
        /*This catch is never reached because Arithmetic exception is a subclass of Exception. */
        /*catch (ArithmeticException e){ //ERROR unreachable code
           System.out.println("This is never reached");
        }*/
    }
}
