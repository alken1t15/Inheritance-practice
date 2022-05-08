package Task2;

public class Car extends VehicleTypeByPurpose {
    public Car() {
        super(VehicleTypeEnum.CAR.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}