package behavioural.memento;

public class Principal {
  public static void main(String[] args) {
    ImageEditor imageEditor = new ImageEditor("/media/image.png", "png");
    ImageEditorBackup backupManager = new ImageEditorBackup(imageEditor);

    System.out.println(imageEditor);
    backupManager.backup(); // salva o estado antes da altereação



    imageEditor.convertFormatTo("gif");

    backupManager.backup();

    imageEditor.convertFormatTo("jpg");

    System.out.println(imageEditor);

    backupManager.undo(); // volta para o format gif

    System.out.println(imageEditor); // mostra o gif

    backupManager.undo(); // volta ao original

     System.out.println(imageEditor); // mostra o original


  }


}
