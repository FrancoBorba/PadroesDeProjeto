package behavioural.command;

public class LuzPowerCommand implements CommandInterface {

  private LuzReciver luz;
  public LuzPowerCommand(LuzReciver luz){
     
    this.luz = luz;
  }

  @Override
  public void execute() {
    this.luz.ON();
  }

  @Override
  public void undo() {
    this.luz.OFF();
  }
}
