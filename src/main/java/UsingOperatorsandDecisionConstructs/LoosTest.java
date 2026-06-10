package UsingOperatorsandDecisionConstructs;

public class LoosTest {
    int k = 5;
    public boolean checkIt(int k){
        return k-->0?true:false; //aqui se ve que se va disminuyendo
    }
    public void printThem(){
        while (checkIt(k)){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        new LoosTest().printThem();
    }
}
