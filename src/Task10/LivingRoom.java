package Task10;

public class LivingRoom extends Room {
    private boolean sofaPresent;
    private boolean wardrobePresent;
    private boolean coffeeTablePresent;
    private boolean tvSetPresent;

    public LivingRoom(final int size, final int numberOfWindows, final DoorType doorType, final int numberOfDoors,
                      final String color, final boolean sofaPresent, final boolean wardrobePresent, final boolean coffeeTablePresent,
                      final boolean tvSetPresent) {
        super(size, numberOfWindows, doorType, numberOfDoors, color);
        this.sofaPresent = sofaPresent;
        this.coffeeTablePresent = coffeeTablePresent;
        this.tvSetPresent = tvSetPresent;
        this.wardrobePresent = wardrobePresent;
    }

    public boolean isSofaPresent() {
        return sofaPresent;
    }

    public void setSofaPresent(final boolean sofaPresent) {
        this.sofaPresent = sofaPresent;
    }

    public boolean getCoffeeTablePresent() {
        return coffeeTablePresent;
    }

    public void setCoffeeTablePresent(final boolean coffeeTablePresent) {
        this.coffeeTablePresent = coffeeTablePresent;
    }

    public boolean getWardrobePresent() {
        return wardrobePresent;
    }

    public boolean isTvSetPresent() {
        return tvSetPresent;
    }

    public void setTvSetPresent(final boolean tvSetPresent) {
        this.tvSetPresent = tvSetPresent;
    }

    public void setWardrobePresent(final boolean wardrobePresent) {
        this.wardrobePresent = wardrobePresent;
    }

    @Override
    public String toString() {
        return "LivingRoom";
    }
}

