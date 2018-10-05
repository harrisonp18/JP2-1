package Activity5;

import java.util.Date;

public class Main {

  public static void main (String args[]){

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn");
    System.out.println(yourChassis.toString());


    ManufacturedEngine engineGeneric = new ManufacturedEngine();
    ManufacturedEngine engineOverload = new ManufacturedEngine("Honda",
        new Date(), "H-Series", "H23A1", 4,
        "88 AKI", "\"2WD: Two-Wheel Drives\"");

    System.out.println(engineGeneric.toString());
    System.out.println(engineOverload.toString());

  }
}
