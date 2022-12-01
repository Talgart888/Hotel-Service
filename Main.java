import Models.Operations;
import Models.TypeRoom;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class Main {
    static String typeRoomEnter = "";
    static int myMoney;
    public static void main(String[] args) {
        Hotel room1 = new Hotel(13, "3", "Однокомнатный студия", TypeRoom.STANDARD);
        Hotel room2 = new Hotel(22, "2", "Трехкомнатный", TypeRoom.LUX);
        Hotel room3 = new Hotel(34, "5", "Пятикомнатный + терраса", TypeRoom.PRESIDENT);
        Hotel room4 = new Hotel(14, "4", "Двухкомнатный студия", TypeRoom.COMFORT);

        System.out.println(room1 + "\n" + TypeRoom.STANDARD.getBonus() +
                "\n-------------------------------------------------------------------------");
        System.out.println(room4 + "\n" + TypeRoom.COMFORT.getBonus() +
                "\n-------------------------------------------------------------------------");
        System.out.println(room2 + "\n" + TypeRoom.LUX.getBonus() +
                "\n-------------------------------------------------------------------------");
        System.out.println(room3 + "\n" + TypeRoom.PRESIDENT.getBonus() +
                "\n-------------------------------------------------------------------------");

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Сегодня: "+"dd.MM.yyyyг. Время: HH:mm:ss" +
                "\n---------------------------------------");
        String formatToday = today.format(formatter);
        System.out.println(formatToday);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько у меня есть денег");
        myMoney = scanner.nextInt();
        System.out.println("Выберите тип номера");
        typeRoomEnter = scanner.next().toUpperCase();

        Operations.operations(typeRoomEnter, myMoney);

    }
}