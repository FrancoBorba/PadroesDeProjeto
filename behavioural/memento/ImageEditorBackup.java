package behavioural.memento;

import java.util.Stack;

public class ImageEditorBackup {

  private Stack<Memento> mementos = new Stack<>(); // PILHA
  ImageEditor imageEditor = new ImageEditor(null, null);

  public ImageEditorBackup(ImageEditor imageEditor){ // construtor com o originator
  this.imageEditor = imageEditor;
  }

  public void backup(){ // salva na pilha os backups
    System.out.println("BACKUP: salvando o estado de imageEditor");
    mementos.push(imageEditor.save());
  }

  public void undo(){
   
    Memento memento = mementos.pop(); // retirando da pilha o ultimo save

    if(memento.equals(null)){
      System.out.println("Sem saves");
    }

    this.imageEditor.restore(memento); // restaurado o ultimo memento
    System.out.println("Restaurado o memento: " + memento.getName());
  }

  
}
