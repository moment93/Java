package p2;

public class Protection2 extends p1.Protection {
    Protection2(){
        System.out.println("Derived other package constructor");
        //class or package only
        //System.out.println(n = " + n);

        //class only
        //System.out.println("n_pri = " + n+pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
