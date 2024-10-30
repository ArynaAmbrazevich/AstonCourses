import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        Employee firstEmployee = new Employee("Aryna", "Tester", "ArynaTester@mail.by", 5943022,
                583.23, 27);
        System.out.println(firstEmployee);
        System.out.println();

        System.out.println("Задание 2: ");
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("ArynaOne", "TesterOne", "ArynaTesterOne@mail.by", 1943022,
                1583.23, 37);
        emplArray[1] = new Employee("ArynaTwo", "TesterTwo", "ArynaTesterTwo@mail.by", 2943022,
                2583.23, 47);
        emplArray[2] = new Employee("ArynaThree", "TesterThree", "ArynaTesterThree@mail.by", 3943022,
                3583.23, 57);
        emplArray[3] = new Employee("ArynaFour", "TesterFour", "ArynaTesterFour@mail.by", 4943022,
                4583.23, 67);
        emplArray[4] = new Employee("ArynaFive", "TesterFive", "ArynaTesterFive@mail.by", 5943022,
                5583.23, 77);
        System.out.println(Arrays.toString(emplArray));
        System.out.println();

        System.out.println("Задание 3: ");
        Park amusementPark = new Park("Парк аттракционов");

        Park.Attraction rollerCoaster = amusementPark.new Attraction("Центрифуга", "10:00 - 19:00", 15.0);
        Park.Attraction ferrisWheel = amusementPark.new Attraction("Колесо омерзения", "10:00 - 20:00", 10.0);
        Park.Attraction hauntedHouse = amusementPark.new Attraction("Хали-Гали", "10:00 - 21:00", 20.0);

        System.out.println("Аттракционы в " + amusementPark.getName() + ":");
        System.out.println(rollerCoaster);
        System.out.println(ferrisWheel);
        System.out.println(hauntedHouse);
    }

}