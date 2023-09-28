package Test;

public class Main {
    public static void main(String[] args) {

        TestObj obj1 = new TestObj();
        TestObj obj2 = new TestObj();

        obj1.setCount(4);

        System.out.println(obj2.getCount());

        TestObj.escreve();

        FirstStatic teste = new FirstStatic();
    }
}
