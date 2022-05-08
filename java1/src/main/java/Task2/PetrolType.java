package Task2;

public class PetrolType extends VehicleTypeByFuelTypes {
    public PetrolType() {
        super(VehicleTypeEnum.PETROL.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}