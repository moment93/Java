//VarArgs overloading and ambiguity.
//
//This program contains an error and will not compile.
public class VarArgs4 {

    static void vaTest(int ... v){
        System.out.print("vaTest(int ...): " + "Number of args: " + v.length + " Contents: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ... v) " + " Number of args: " + v.length + " Contents: ");
        for(boolean x : v)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        vaTest(1,2,3);// OK
        vaTest(true,false,false);
       // vaTest(); //Error Ambigious
    }

}
