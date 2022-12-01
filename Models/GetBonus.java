package Models;

public interface GetBonus {
    String juice = "сок";
    String juiceGape = "сок + виноград";
    String massageKFC = "массаж + KFC";
    String president = "10 мин переговора с президентом";

    abstract String getBonus();

    abstract String standardBonus();

    abstract String comfortBonus();

    abstract String luxBonus();

    abstract String presidentBonus();

    abstract String nameHotel();

    abstract String setTime();

    abstract String outTime();

}
