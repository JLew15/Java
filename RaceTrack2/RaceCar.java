public class RaceCar implements IRacer{


    private String myName;
    private double myMaxSpeed;
    private double myAcceleration;
    private double myCurrentSpeed;

    public RaceCar (String name, double maxSpeed, double acceleration){
      myName = name;
      myMaxSpeed = maxSpeed;
      myAcceleration = acceleration;
      myCurrentSpeed = 0.0;
    }
    public String getName(){
      return myName;
    }
    public double getCurrentSpeed(){
      return myCurrentSpeed;
    }
    public void resetCurrentSpeed(){
      myCurrentSpeed = 0.0;
    }
    public void accelerate(){
      myCurrentSpeed = myCurrentSpeed + myAcceleration;
      if(myCurrentSpeed > myMaxSpeed){
        myCurrentSpeed = myMaxSpeed;
      }
    }
}
