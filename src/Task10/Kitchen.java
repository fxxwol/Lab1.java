package Task10;

public class Kitchen extends Room{

    private int numberOfCabinets;
    private int sittingPlaces;
    private boolean refrigeratorPresent;

    public Kitchen(final int size, final int numberOfWindows,
                   final int numberOfDoors, final String color, final int numberOfCabinets,
                   final int sittingPlaces, final DoorType doortype, final boolean refrigeratorPresent) {
        super(size, numberOfWindows, doortype, numberOfDoors, color);
        this.numberOfCabinets = numberOfCabinets;
        this.sittingPlaces = sittingPlaces;
        this.refrigeratorPresent = refrigeratorPresent;
    }

    @Override
    public String toString() {
        return "Kitchen";
    }

    public void setRefrigeratorPresent(final boolean refrigeratorPresent) {
        this.refrigeratorPresent = refrigeratorPresent;
    }

    public boolean getRefrigeratorPresent() {
        return refrigeratorPresent;
    }

    public int getNumberOfCabinets() {
        return numberOfCabinets;
    }

    public void setNumberOfCabinets(final int numberOfCabinets) {
        this.numberOfCabinets = numberOfCabinets;
    }

    public int getSittingPlaces() {
        return sittingPlaces;
    }

    public void setSittingPlaces(final int sittingPlaces) {
        this.sittingPlaces = sittingPlaces;
    }
}

