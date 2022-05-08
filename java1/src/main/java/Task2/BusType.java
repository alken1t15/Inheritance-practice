package Task2;

public class BusType extends VehicleTypeByBodyTypes {
    public BusType() {
        super(VehicleTypeEnum.BUS.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}