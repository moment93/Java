//Create a Superclass
//This class contains an error and will not compile, change j to public and uncomment line 26
public class A {
    int i; //public be default
    private int j; //private to A

    void setij(int x, int y){
        i = x;
        j = y;
    }
    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}

//Create superclass by extending class A
//A's J is not accessible here
class B extends A{
    int k;
    int total;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
       // System.out.println("i + j + k: " + (i+j+k));
    } //Error J is not accessible here
}
