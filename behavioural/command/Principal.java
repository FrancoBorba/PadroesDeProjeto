package behavioural.command;

public class Principal {
  public static void main(String[] args) {
    
    LuzReciver luzdoQuarto = new LuzReciver("Luz do quarto"); // receiver
    LuzReciver luzDoBanheiro = new LuzReciver("Luz do banheiro");
    LuzPowerCommand luzQuartoComando = new LuzPowerCommand(luzdoQuarto); // command
    LuzPowerCommand luzBanheiroComando = new LuzPowerCommand(luzDoBanheiro);
    

    CasaInteligenteInvoker invoker = new CasaInteligenteInvoker(); // invoker

    invoker.addCommand("botão-1", luzQuartoComando);
    invoker.addCommand("botão-2", luzBanheiroComando);

    invoker.executeCommand("botão-1");
    invoker.undoCommand("botão-1");

    invoker.executeCommand("botão-2");
    invoker.undoCommand("botão-2");
   
  }
}
