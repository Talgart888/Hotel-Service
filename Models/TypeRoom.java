package Models;

public enum TypeRoom implements GetBonus {
    STANDARD(70, "TV + кондиционер"){
        @Override
        public String getBonus() {
            return "Если выберите номер типа " + "'"+TypeRoom.STANDARD+"'" + " то в качестве бонуса полчуите " + "'"+GetBonus.juice+"'";
        }
    },
    COMFORT(120, "TV + кондиционер + диван"){
        @Override
        public String getBonus() {
            return "Если выберите номер типа " + "'"+TypeRoom.COMFORT+"'" + " то в качестве бонуса полчуите " + "'"+GetBonus.juiceGape+"'";
        }
    },
    LUX(200, "TV + кондиционер + диван + джакузи"){
        @Override
        public String getBonus() {
            return "Если выберите номер типа " + "'"+TypeRoom.LUX+"'" + " то в качестве бонуса полчуите " + "'"+GetBonus.massageKFC+"'";
        }
    },
    PRESIDENT(800, "TV + кондиционер + диван + джакузи + сам президент"){
        @Override
        public String getBonus() {
            return "Если выберите номер типа " + "'"+TypeRoom.PRESIDENT+"'" + " то в качестве бонуса полчуите " + "'"+GetBonus.president+"'";
        }
    };
    private final int PRICE;
    private final String OPTIONS;

    TypeRoom(int PRICE, String OPTIONS) {
        this.PRICE = PRICE;
        this.OPTIONS = OPTIONS;
    }

    public int getPRICE()
    {
        return PRICE;
    }

    public String getOPTIONS() {
        return OPTIONS;
    }


    @Override
    public String standardBonus() {
        return GetBonus.juice;
    }
    @Override
    public String comfortBonus() {
        return GetBonus.juiceGape;
    }
    @Override
    public String luxBonus() {
        return GetBonus.massageKFC;
    }
    @Override
    public String presidentBonus() {
        return GetBonus.president;
    }

    @Override
    public String nameHotel() {
        return "Main Hotel";
    }

    @Override
    public String setTime() {
        return "c 12:00";
    }

    @Override
    public String outTime() {
        return "до 14:00";
    }


}
