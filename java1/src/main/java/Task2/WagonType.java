package Task2;

public class WagonType extends VehicleTypeByBodyTypes {
    public WagonType() {
        super(VehicleTypeEnum.WAGON.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}