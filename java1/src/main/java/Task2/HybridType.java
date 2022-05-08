package Task2;

public class HybridType extends VehicleTypeByFuelTypes {
    public HybridType() {
        super(VehicleTypeEnum.HYBRID.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}