package chapter8;

public enum Region {
    NE("Ajegunle", "Ikeja", "Abuja"),
    SE("VI", "BI"),
    SW("Mushin", "Ketu", "Okoko", "Ipaja"),
    NC("ibadan", "Ekiti", "Ijebu"),
    SS("sabo", "Bariga", "Somolu"),
    NN("Challenge", "Molete", "Mowe");

    private String[] states;

    Region(String... states){
        this.states = states;
    }
}
