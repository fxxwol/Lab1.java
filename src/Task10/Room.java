package Task10;

public class Room {
    private int size;
    private int numberOfWindows;
    private int numberOfDoors;
    private String color;
    private DoorType doorType;

    public Room(final int size, final int numberOfWindows,final DoorType doorType, final int numberOfDoors, final String color) {
        this.size = size;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
        this.doorType = doorType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void addWindow() {
        numberOfWindows++;
    }

    public void removeWindow() throws Exception {
        numberOfWindows--;
        if (numberOfWindows < 0) {
            throw new Exception("There is no windows");
        }
    }

    public void addDoor(final DoorType doorType) {
        this.doorType = doorType;
        numberOfDoors++;
    }

    public void removeDoor(final DoorType type) throws Exception {
        for (int i  = 0; i < numberOfDoors; i++){
            if(doorType == type){
                numberOfDoors--;
            }
        }
        if (numberOfDoors < 0) {
            throw new Exception("There is no doors");
        }
    }

    public void paintRoom(final String color) {
        setColor(color);
    }

    public void increaseSize(final int size) throws Exception {
        if (size < 0) {
            throw new Exception("size can't be negative");
        }
        setSize(this.size+size);
    }

    public void decreaseArea(final int size) throws Exception {
        if (size < 0) {
            throw new Exception("size can't be negative");
        }
        final int finalSize = this.size - size;
        if (finalSize < 0) {
            throw new Exception("size can't be negative");
        }
        setSize(finalSize);
    }
}
