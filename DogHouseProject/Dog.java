public class Dog{
  private int numTimesFed = 0;
  private boolean sleeping = false;
  private String name = "Ruffer";

  public String getName(){
    return name;
  }

  public void wakeUp(){
    System.out.println("WAKING UP");
    sleeping = false;
    numTimesFed = 0;
  }

  public void sleep(){
    sleeping = true;
    System.out.println("SLEEPING");
  }

  public void hear(String sound){
    if(sleeping == true){
      return;
    }
    if(sound.equals(name)){
      System.out.println("WAG TAIL");
    }
    else if(sound.equals("ding-dong")){
      System.out.println("BARK");
    }
    else{
      return;
    }
  }

  public void feed(){
    if(sleeping == true){
      return;
    }
    else{
      numTimesFed++;
    }
    if(numTimesFed > 2){
      System.out.println("YAWN");
    }
    else{
      System.out.println("YUMMY");
    }
  }

}
