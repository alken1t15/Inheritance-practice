package Task2;

public class TruckType extends VehicleTypeByPurpose {
    public TruckType() {
        super(VehicleTypeEnum.PICKUP.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}