package Test;

public class TestObj {

    public static class test2 {

    }

    private static int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        TestObj.count = count;
    }

    public static void escreve() {
        System.out.println(count);
    }

    public void escreve2() {
        TestObj.escreve();
    }


}
