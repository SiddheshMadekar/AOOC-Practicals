class Employee {
    String name = "Rahul";
    double salary = 50000;
    void bonus() {
    System.out.println("Bonus: " + (salary * 0.1));
}
}
class Manager extends Employee {}
class Developer extends Employee {}
class Programmer extends Employee {}
public class Main2 {
public static void main(String[] args) {
     Manager m = new Manager();
     m.bonus();
}
}