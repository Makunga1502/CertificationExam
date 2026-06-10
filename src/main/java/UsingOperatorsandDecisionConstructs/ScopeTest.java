package UsingOperatorsandDecisionConstructs;

public class ScopeTest {
    static int x = 5;

    public static void main(String[] args) {
        int x = (x=3) * 4; // se hace una reasignación al valor x y se hace la operación normal
        System.out.println(x);
    }
}
