class Student {
    int roll = 1;
}
class Test extends Student {
    int m1 = 80, m2 = 90;
}
class Result extends Test {
    void show() {
    System.out.println("Roll: " + roll);
    System.out.println("Total: " + (m1 + m2));
}
}
public class Main4 {
    public static void main(String[] args) {
    Result r = new Result();
    r.show();
}
}