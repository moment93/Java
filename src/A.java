//Create a Superclass
//This class contains an error and will not compile, change j to public and uncomment line 26
public class A {
    int i; //public be default
    int j;


    void setij(int x, int y){
        i = x;
        j = y;
    }
    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }

    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

//Create superclass by extending class A
//A's J is not accessible here
class B extends A implements A.NestedIF {
    int k;
    int total;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
       // System.out.println("i + j + k: " + (i+j+k));
    } //Error J is not accessible here

    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
