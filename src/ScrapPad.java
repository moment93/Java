import java.util.Random;

class ScrapPad{

    public static void main(String[] args) {

        RecTestClass rtest = new RecTestClass();
        rtest.PrintRand();
    }
}

class RecTestClass{

    void PrintRand(){
        Random r = new Random();
        int rand = r.nextInt(10);
        System.out.println(rand);
        if(rand != 2){
            PrintRand();
        }
    }
}