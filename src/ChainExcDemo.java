public class ChainExcDemo {
    static void demoproc(){
        //create an exception
        NullPointerException e = new NullPointerException("top layer");
        //ad a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            //Display top level exception
            System.out.println("Caught: " + e);
            //Display cause exception
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
