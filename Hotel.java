

import Models.TypeRoom;

public class Hotel {
    private int number;
    private String floor;
    private String room;
    private TypeRoom typeRoom;

    public Hotel(int number, String floor, String room, TypeRoom typeRoom) {
        this.number = number;
        this.floor = floor;
        this.room = room;
        this.typeRoom = typeRoom;
    }


    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    @Override
    public String toString() {
        return
                "Номер комнаты: " + number + '\n' +
                "Этаж: " + floor + '\n' +
                "Размер комнаты: " + room + '\n' +
                "Тип номера: " + getTypeRoom().toString() +  '\n' +
                "Цена номера ($): " + getTypeRoom().getPRICE() + '\n' +
                "В номере " +getTypeRoom().name() + " включено: " + getTypeRoom().getOPTIONS();
    }

}
