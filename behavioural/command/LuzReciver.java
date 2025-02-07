package behavioural.command;

public class LuzReciver {
  private boolean isON = false; // luz ligada ou desligada
  private int intensity = 50; // intensidade da luz de 0 a 100
  private String name;

  public LuzReciver(String name){
    this.name = name;
  }

  public String getPowerStatus(){
    return this.isON ? "ON" : "OFF"; // ternario do boolean
  }

  public boolean ON(){ // acende a luz
    this.isON = true;
    System.out.println(this.name + "está: " + getPowerStatus());
    return this.isON;
  }

  public boolean OFF(){ // acende a luz
    this.isON = false;
     System.out.println(this.name + "está: " + getPowerStatus());
    return this.isON;
  }

  public int increaseIntensity(){
    if(this.intensity >= 100){
      return this.intensity;
    } else{
      this.intensity += 5; // aumenta a intencidade de 5 em 5
    return this.intensity;
    } 
  }

   public int decreaseIntensity(){
    if(this.intensity <= 0){
      return this.intensity;
    } else{
      this.intensity += -5; // diminui a intencidade de 5 em 5
    return this.intensity;
    } 
  }
}
