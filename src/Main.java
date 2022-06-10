import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Student> set = new HashSet<>();
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
        String input = scanner.nextLine();
        set.add(inputStudent(input));

        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"(end\")");
            input = scanner.nextLine();
            if (input.equals("end")) {
                listStudets(set);
                return;
            }
            if (!set.add(inputStudent(input))) {
                System.out.println("Студент с таким номером студенческого есть в списке!");
            }
        }
    }

    public static void listStudets(Set<Student> set) {
        for (Student student : set) {
            System.out.println("- " + student);
        }
    }

    public static Student inputStudent(String info) {
        String[] split = info.split(",");
        return new Student(split[0], split[1], split[2]);
    }
}