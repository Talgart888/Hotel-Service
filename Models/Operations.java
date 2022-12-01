package Models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operations {
    public static void operations(String typeRoomEnter, int myMoney) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatToday = today.format(formatter);

        if (typeRoomEnter.equals(TypeRoom.STANDARD.toString())) {
            if (myMoney >= TypeRoom.STANDARD.getPRICE()) {
                int standardDate = myMoney / TypeRoom.STANDARD.getPRICE();
                int surrender = myMoney - (standardDate * TypeRoom.STANDARD.getPRICE());
                System.out.println("\nВы оплатили за " + TypeRoom.STANDARD + " номер " + myMoney + "$ на " + standardDate +
                        " дней. \nВаше сдачи: " + surrender + "$");
                System.out.println("Дата вашего заезда: " + formatToday + " " + TypeRoom.STANDARD.setTime());
                LocalDateTime outDate = today.plusDays(standardDate);
                String formatOutDay = outDate.format(formatter);
                System.out.println("Дата выселения: " + formatOutDay + " " + TypeRoom.STANDARD.outTime());

                Registration.registration();

                System.out.println("Вы выбрали номер " + "'" + TypeRoom.STANDARD + "'. " +
                        "В качестве бонуса вы получаете " + "'" + GetBonus.juice + "'." + "'." + "Спасибо что выбрали отель " +
                        "'" + TypeRoom.COMFORT.nameHotel() + "'." + "Приятного вам отдыха..");
            }
            if (myMoney < TypeRoom.STANDARD.getPRICE()) {
                System.out.println("Извините у вас всего денег - " + "'" + myMoney + "'. " + "'" + TypeRoom.STANDARD + "'"
                        + "номер стоит " + TypeRoom.STANDARD.getPRICE() + " Приходите когда у вас будут деньги."
                );
            }
        } else if (typeRoomEnter.equals(TypeRoom.COMFORT.toString())) {
            if (myMoney >= TypeRoom.COMFORT.getPRICE()) {
                int comfortDate = myMoney / TypeRoom.COMFORT.getPRICE();
                int surrender = myMoney - (comfortDate * TypeRoom.COMFORT.getPRICE());

                System.out.println("\nВы оплатили за " + TypeRoom.COMFORT + " номер " + myMoney + "$ на " + comfortDate +
                        " дней. \nВаше сдачи: " + surrender + "$");
                System.out.println("Дата вашего заезда: " + formatToday + " " + TypeRoom.COMFORT.setTime());
                LocalDateTime outDate = today.plusDays(comfortDate);
                String formatOutDay = outDate.format(formatter);
                System.out.println("Дата выселения: " + formatOutDay + " " + TypeRoom.COMFORT.outTime());

                Registration.registration();

                System.out.println("Вы выбрали номер " + "'" + TypeRoom.COMFORT + "'. " +
                        "В качестве бонуса вы получаете " + "'" + GetBonus.juiceGape + "'." + "Спасибо что выбрали отель " +
                        "'" + TypeRoom.COMFORT.nameHotel() + "'." + " Приятного вам отдыха..");
            }
            if (myMoney < TypeRoom.COMFORT.getPRICE()) {
                System.out.println("Извините у вас недостаточно денег - " + "'" + myMoney + "'. " + "'" + TypeRoom.COMFORT + "'"
                        + "номер стоит " + TypeRoom.COMFORT.getPRICE() + " Вы можете взять номер " + "'" + TypeRoom.STANDARD + "'"
                        + " всего за " + TypeRoom.STANDARD.getPRICE()
                );
            }
        } else if (typeRoomEnter.equals(TypeRoom.LUX.toString())) {
            if (myMoney >= TypeRoom.LUX.getPRICE()) {
                int luxDate = myMoney / TypeRoom.LUX.getPRICE();
                int surrender = myMoney - (luxDate * TypeRoom.LUX.getPRICE());

                System.out.println("\nВы оплатили за " + TypeRoom.LUX + " номер " + myMoney + "$ на " + luxDate +
                        " дней. \nВаше сдачи: " + surrender + "$");
                System.out.println("Дата вашего заезда: " + formatToday + " " + TypeRoom.LUX.setTime());
                LocalDateTime outDate = today.plusDays(luxDate);
                String formatOutDay = outDate.format(formatter);
                System.out.println("Дата выселения: " + formatOutDay + " " + TypeRoom.LUX.outTime());

                Registration.registration();

                System.out.println("Вы выбрали номер " + "'" + TypeRoom.LUX + "'. " +
                        "В качестве бонуса вы получаете " + "'" + GetBonus.massageKFC + "'." + "'." + "Спасибо что выбрали отель " +
                        "'" + TypeRoom.COMFORT.nameHotel() + "'." + "Приятного вам отдыха..");
            }
            if (myMoney < TypeRoom.LUX.getPRICE()) {
                System.out.println("Извините у вас недостаточно денег - " + "'" + myMoney + "'. " + "'" + TypeRoom.LUX + "'"
                        + "номер стоит " + TypeRoom.LUX.getPRICE() + " Вы можете взять номер " + "'" + TypeRoom.COMFORT + "'"
                        + " всего за " + TypeRoom.COMFORT.getPRICE()
                );
            }
        } else if (typeRoomEnter.equals(TypeRoom.PRESIDENT.toString())) {
            if (myMoney >= TypeRoom.PRESIDENT.getPRICE()) {
                int presidentDate = myMoney / TypeRoom.PRESIDENT.getPRICE();
                int surrender = myMoney - (presidentDate * TypeRoom.PRESIDENT.getPRICE());

                System.out.println("\nВы оплатили за " + TypeRoom.PRESIDENT + " номер " + myMoney + "$ на " + presidentDate +
                        " дней. \nВаше сдачи: " + surrender + "$");
                System.out.println("Дата вашего заезда: " + formatToday + " " + TypeRoom.PRESIDENT.setTime());
                LocalDateTime outDate = today.plusDays(presidentDate);
                String formatOutDay = outDate.format(formatter);
                System.out.println("Дата выселения: " + formatOutDay + " " + TypeRoom.PRESIDENT.outTime());

                Registration.registration();

                System.out.println("Вы выбрали номер " + "'" + TypeRoom.PRESIDENT + "'. " +
                        "В качестве бонуса вы получаете " + "'" + GetBonus.president + "'." + "'." + "Спасибо что выбрали отель " +
                        "'" + TypeRoom.COMFORT.nameHotel() + "'." + "Приятного вам отдыха..");
            }
            if (myMoney < TypeRoom.PRESIDENT.getPRICE()) {
                System.out.println("Извините у вас всего денег - " + "'" + myMoney + "'. " + "'" + TypeRoom.PRESIDENT + "'"
                        + "номер стоит " + TypeRoom.PRESIDENT.getPRICE() + " Вы можете взять номер " + "'" + TypeRoom.LUX + "'"
                        + " всего за " + TypeRoom.LUX.getPRICE()
                );
            }
        } else {
            System.out.println("Вы ввели неккоректный выбор номера, если хотите стандарт номер - 'STANDARD' \n комфорт номер - 'COMFORT'\n" +
                            " люкс номер - 'LUX'\n президент номер - 'PRESIDENT'");
        }
    }
}
