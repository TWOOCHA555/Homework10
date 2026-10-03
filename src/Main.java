//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("_________");
        System.out.println("Задача 1:");
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Ф.И.О. сотрудника - " + fullName);
        }

        System.out.println("_________");
        System.out.println("Задача 2:");
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        }


        System.out.println("_________");
        System.out.println("Задача 3:");
        {
            String fullName = "Иванов Семён Семёнович";
            String fullNameTrue = fullName.replace("ё", "е");
            System.out.println("Данные Ф.И.О. сотрудника - " + fullNameTrue);
        }

    }
}