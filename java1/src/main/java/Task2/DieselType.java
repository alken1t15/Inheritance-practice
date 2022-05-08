package Task2;

public class DieselType extends VehicleTypeByFuelTypes {
    public DieselType() {
        super(VehicleTypeEnum.DIESEL.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}