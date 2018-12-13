public class RaceCar implements IRacer{

  public RaceCar(){
    String name = "Name";
    double maxSpeed = 0.0;
    double acceleration = 0.0;
    double myCurrentSpeed = 0.0;
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
