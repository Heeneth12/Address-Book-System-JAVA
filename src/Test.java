
import java.util.HashMap;
import java.util.Map;

class A extends Thread {

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("hi..!");
        }
    }

}

class B extends Thread {

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

class Num {

    public void show() {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("heeneth", 22);
        System.out.println(my);

    }

}

public class Test {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();

    }

}