package fase2;

public class TestTwo {
    public static void tetsInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }

    public static void main(String[] args) {
        Integer vall = new Integer(5);
        int val2 = 9;
        tetsInts(vall++, ++val2);
        System.out.println(vall+" "+val2);
    }
}
