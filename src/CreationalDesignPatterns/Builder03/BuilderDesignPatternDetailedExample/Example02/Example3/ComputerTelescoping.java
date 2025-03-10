package CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example3;


// Constructor for every specific configuration
public class ComputerTelescoping {

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public ComputerTelescoping(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public ComputerTelescoping(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize) {
        this.diskSize = diskSize;
        this.ramSize = ramSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasUsbc) {
        this.diskSize = diskSize;
        this.ramSize = ramSize;
        this.hasUsbc = hasUsbc;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasUsbc, boolean hasGigabitWifi) {
        this.diskSize = diskSize;
        this.ramSize = ramSize;
        this.hasUsbc = hasUsbc;
        this.hasGigabitWifi = hasGigabitWifi;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean isHasUsbc() {
        return hasUsbc;
    }

    public boolean isHasGigabitWifi() {
        return hasGigabitWifi;
    }
}
