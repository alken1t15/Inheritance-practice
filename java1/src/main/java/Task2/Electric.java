package Task2;

public class Electric extends VehicleTypeByFuelTypes {
    public Electric() {
        super(VehicleTypeEnum.ELECTRIC.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}