package Task10;

import java.util.List;
import java.util.Objects;

public class House {
    private int size;
    private List<Room> rooms;
    private String address;

    public House(final int size, final List<Room> rooms, final String address) {
        this.size = size;
        this.rooms = rooms;
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        final House house = (House) o;
        return  Objects.equals(getSize(), house.getSize()) &&
                Objects.equals(getRooms(), house.getRooms()) &&
                Objects.equals(getAddress(), house.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getRooms(), getAddress());
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", rooms=" + rooms +
                ", address='" + address + '\'' +
                '}';
    }
}
