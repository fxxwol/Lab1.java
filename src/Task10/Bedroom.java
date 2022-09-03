package Task10;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private int sleepingPlace;

    public Bedroom(final int size, final int numberOfWindows,
                   final int numberOfDoors,
                   final String color,
                   final BedroomType bedroomType,
                   final int sleepingPlace, final DoorType doortype) {
        super(size, numberOfWindows, doortype, numberOfDoors, color);
        this.bedroomType = bedroomType;
        this.sleepingPlace = sleepingPlace;
    }

    @Override
    public String toString() {
        return "Bedroom";
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(final BedroomType bedroomType) {
        this.bedroomType = bedroomType;
    }

    public int getSleepingPlace() {
        return sleepingPlace;
    }

    public void setSleepingPlace(final int sleepingPlace) {
        this.sleepingPlace = sleepingPlace;
    }
}

