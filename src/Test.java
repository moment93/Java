//Objects may be passed to methods
class Test{
    int a; //default access
    public int b; //public access
    private int c; //private access

    //methods to access c
    void setc(int i){ //set c's value
        c = i;
    }

    int getc(){//get c's value
        return c;
    }

    Test(){

    }

    Test(int i){
        a = i;
    }

    Test(int i, int j){
        a = i;
        b = j;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }

    //return true if o is equal to the invoking object
    boolean equalTo(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }

    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}