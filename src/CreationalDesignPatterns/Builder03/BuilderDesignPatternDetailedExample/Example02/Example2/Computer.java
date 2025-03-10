package CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example2;

public class Computer {

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public Computer() {

    }


    public HDD getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public void setRamSize(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public boolean isHasUsbc() {
        return hasUsbc;
    }

    public void setHasUsbc(boolean hasUsbc) {
        this.hasUsbc = hasUsbc;
    }

    public boolean isHasGigabitWifi() {
        return hasGigabitWifi;
    }

    public void setHasGigabitWifi(boolean hasGigabitWifi) {
        this.hasGigabitWifi = hasGigabitWifi;
    }
}
