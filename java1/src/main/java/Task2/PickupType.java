package Task2;

public class PickupType extends VehicleTypeByBodyTypes {
    public PickupType() {
        super(VehicleTypeEnum.PICKUP.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}