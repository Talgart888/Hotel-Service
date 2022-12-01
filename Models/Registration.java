package Models;

import java.util.Scanner;

public class Registration {
    public static void registration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВас надо зарегестрировать в нашей системе.");
        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        System.out.print("Введите ваше фамилия: ");
        String secondName = scanner.next();
        System.out.print("Введите ID вашего паспорта: ");
        int passport = scanner.nextInt();
    }
}
