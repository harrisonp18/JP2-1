package Activity5;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders, String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType + " AKI";
    this.driveTrain = driveTrain;
  }

  public ManufacturedEngine(){
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-Wheel Drives";
  }


  public void setEngineCylinders(int engineCylinders){
    this.engineCylinders = engineCylinders;
  };

  public void setEngineManufacturedDate(Date date){
    this.engineManufacturedDate = date;
  };

  public void setEngineManufacturer(String manufacturer){
    this.engineManufacturer = manufacturer;
  };

  public void setEngineMake(String engineMake){
    this.engineMake = engineMake;
  };

  public void setEngineModel(String engineModel){
    this.engineModel = engineModel;
  };

  public void setDriveTrain(String driveTrain){
    this.driveTrain = driveTrain;
  };

  public void setEngineType(String fuel){
    this.engineType = fuel;
  };

  @Override
  public String toString() {
    return "ManufacturedEngine{" +
        "engineManufacturer='" + engineManufacturer + '\'' +
        ", engineManufacturedDate=" + engineManufacturedDate +
        ", engineMake='" + engineMake + '\'' +
        ", engineModel='" + engineModel + '\'' +
        ", engineCylinders=" + engineCylinders +
        ", engineType='" + engineType + '\'' +
        ", driveTrain='" + driveTrain + '\'' +
        '}';
  }


}
