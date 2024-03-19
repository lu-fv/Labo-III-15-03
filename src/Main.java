//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person(123, "Leo");
        Person p3 = null;

        p2.getDni();
        System.out.println(p2.getDni());
        ///  p2.getFirstName();

        initCar();


    }

    public static void initCar() {
        Car c = new Car("ford", 2009); // instanciar clase Car
        System.out.println(c.getMark());
        System.out.println( c.typeModel());

    }


}
