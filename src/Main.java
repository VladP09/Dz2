import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String fio = in.nextLine();
        System.out.println("Введите номер группы: ");
        String group = in.nextLine();
        System.out.println("Введите оценки через пробел: ");
        String marks = in.nextLine();
        String[] marks1 = marks.split(" ");


        Student student = new Student(fio, group, marks1);
        student.info();
        System.out.println("Средний балл: "+ student.averageRating());

    }
}