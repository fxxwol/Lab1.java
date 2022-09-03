package Task10;

import java.util.List;

public class Main {
    public static void main(final String[] args){
        final House house = new House(80, List.of(
                new Kitchen(10, 2, 1, "yellow", 4, 4,
                        DoorType.PANEL_DOOR, true),
                new Bathroom(5, 0, 1, DoorType.PANEL_DOOR, "blue",
                        ToiletType.BACK_TO_WALL, true, true, BathType.SHOWER_CABIN),
                new Bedroom(15, 1, 1,"pink", BedroomType.MAIN, 2, DoorType.SWING_DOOR),
                new LivingRoom(25, 2, DoorType.FRENCH_DOOR, 1, "grey", true,
                        true, true, true)), "Zelena 22");

        System.out.println(house);
        System.out.println("Start building");
        house.getRooms().get(1).paintRoom("Light green");
        System.out.println("paint room");
        try {
            house.getRooms().get(3).increaseSize(2);
        }catch(final Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("increase size of room");
        house.getRooms().get(2).addDoor(DoorType.GLASS_DOOR);
        System.out.println("build a new door");
        System.out.println("End building");
        System.out.println("Repaired house:");
        System.out.println(house);
        System.out.println("Color of Bathroom: " + house.getRooms().get(1).getColor());
        System.out.println("Size of living room: " + house.getRooms().get(3).getSize());
        System.out.println("Number of doors in bedroom: " + house.getRooms().get(2).getNumberOfDoors());
    }
}
