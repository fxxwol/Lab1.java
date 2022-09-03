package Task10;

public class Bathroom extends Room{
    private ToiletType toiletType;
    private boolean mirrorPresent;
    private boolean sinkPresent;
    private BathType bathType;

    public Bathroom(final int size,final int numberOfWindows,final int numberOfDoors, final DoorType doorType,
                    final String color,final ToiletType toiletType,final  boolean mirrorPresent,final  boolean sinkPresent,
                    final  BathType bathType) {
        super(size, numberOfWindows,doorType, numberOfDoors, color);
        this.toiletType = toiletType;
        this.mirrorPresent = mirrorPresent;
        this.sinkPresent = sinkPresent;
        this.bathType = bathType;
    }

    @Override
    public String toString() {
        return "Bathroom";
    }

    public ToiletType getToiletType() {
        return toiletType;
    }

    public void setToiletType(final ToiletType toiletType) {
        this.toiletType = toiletType;
    }

    public boolean isMirrorPresent() {
        return mirrorPresent;
    }

    public void setMirrorPresent(final boolean mirrorPresent) {
        this.mirrorPresent = mirrorPresent;
    }

    public boolean isSinkPresent() {
        return sinkPresent;
    }

    public void setSinkPresent(final boolean sinkPresent) {
        this.sinkPresent = sinkPresent;
    }

    public BathType getBathType() {
        return bathType;
    }

    public void setBathType(final BathType bathType) {
        this.bathType = bathType;
    }
}
