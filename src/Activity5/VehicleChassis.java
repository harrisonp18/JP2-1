package Activity5;

public class VehicleChassis implements Chassis{

//  Create a String named chassisName instance variable.
  public String chassisName;
//  A public default constructor and an overloaded constructor with the following value:A String with a parameter value of chassisName
  public VehicleChassis(){
    this.chassisName = chassis;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }
//  Set the chassisName instance variable in both, use the interface constant as the default String value.

//  A public method named getChassisType that doesnt have a formal parameter and that returns an instance of the interface Chassis (hint that would be a copy of this class).
  public Chassis getChassisType() {
    return this;
  }
//  A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It should set the instance variable chassisName.
  public void setChassisType(String vehicleChassis){
    chassisName = vehicleChassis;
  }
//  A public toString method that returns the following:Chassis Name        : Chassis
  public String toString() {
    return "Chassis Name :" + chassisName;
  }
//  Write a static main method that creates two objects, one with the default constructor and the other with the constructor with parameters.  Give sample data for the parameters.

}
