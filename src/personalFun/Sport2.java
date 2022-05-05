package personalFun;

public class Sport2 {
    private Building building;
    private Equipments equipments;
    private Jerseys jerseys;

    public Building getBuilding() {
        return building;
    }

    public Equipments getEquipments() {
        return equipments;
    }

    public Jerseys getJerseys() {
        return jerseys;
    }

    public Sport2(Building building, Equipments equipments, Jerseys jerseys) {
        this.building = building;
        this.equipments = equipments;
        this.jerseys = jerseys;
    }
}
