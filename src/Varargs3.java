public class Varargs3 {
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

    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(string msg, int ... ): " + msg + v.length + " Contents: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}
