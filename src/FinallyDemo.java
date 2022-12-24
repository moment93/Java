//Demonstrate finally
public class FinallyDemo {
    //throw an exception out of a method
    static void procA(){
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("ProcA's finally");
        }
    }

    //Return from within a try block
    static void procB(){
        try{
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("ProcB finally");
        }
    }

    static void procC(){
        try{
            System.out.println("inside procC");
        }finally {
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("Exception cought");
        }
        procB();
        procC();
    }
}
