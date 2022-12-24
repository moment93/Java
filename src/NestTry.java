//An example of a nested try statement
public class NestTry {

    public static void main(String[] args) {
        int a = args.length;

        /* If no command args are present this code will generate divide by zero exception*/
        int b = 42 / a;
        System.out.println("a = " + a);

        try {//Nested try block
            if(a == 1 ) a = a / (a-a);//Division by zero
            //* If one command arg is used this will generate out of bounds exception */
            if(a == 2){
                int[] c = {1};
                c[42] = 99; //Generate an out-of-bounds exception
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds: " + e);
        }catch (ArithmeticException e){
            System.out.println("Divide by zero exception: " + e);
        }

    }
}
