public class Owner {
    public Boolean parkingStateFull;
public Boolean  parkingFreeSpace;
    public void notifyOwner(Boolean parkingFreeSpace) {
        this.parkingFreeSpace=parkingFreeSpace;

    }
    public void notifyOwnerWhenParkingFull(Boolean parkingStateFull){
        this.parkingStateFull=parkingStateFull;
    }
}
