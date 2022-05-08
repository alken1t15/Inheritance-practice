package Task2;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
      /* VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

     //   adsService.filterByVehicleTypeByPurpose(new PassengerType());

      //  adsService.filterByVehicleTypeByPurpose(new TruckType());

       */
        VehicleAd bmv = new VehicleAd("BMV", "22", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd audi = new VehicleAd("Audi", "44", new PassengerType(), new PickupType(), new DieselType());
        VehicleAd porshe = new VehicleAd("Audi", "40", new PassengerType(), new WagonType(), new Electric());
        adsService.setAdList(new VehicleAd[] {bmv,audi,porshe});
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
