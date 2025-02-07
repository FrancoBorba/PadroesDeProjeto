package behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class CasaInteligenteInvoker {
  
 private Map<String, CommandInterface> commands = new HashMap<>();

    public void addCommand(String key, CommandInterface command) {
        commands.put(key, command);
    }

    public void executeCommand(String key) {
        if (commands.containsKey(key)) {
            commands.get(key).execute();
        } else {
            System.out.println("Comando não encontrado: " + key);
        }
    }

    public void undoCommand(String key) {
        if (commands.containsKey(key)) {
            commands.get(key).undo();
        } else {
            System.out.println("Comando não encontrado: " + key);
        }
    }
}
