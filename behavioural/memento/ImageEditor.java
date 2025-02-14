package behavioural.memento;


import java.time.Instant;
import java.util.Date;

// ESTE EH O ORIGINATOR
public class ImageEditor {

  private String filePath;
  private String fileFormat;

  
  public ImageEditor(String filePath, String fileFormat) {
    this.filePath = filePath;
    this.fileFormat = fileFormat;
  }

  public void convertFormatTo(String format){
    this.fileFormat = format;
    this.filePath = removeExtension(filePath).concat("."+format);
  }

   private String removeExtension(String filePath) { // metodo para remover o caminho
        int lastDotIndex = filePath.lastIndexOf(".");
        if (lastDotIndex != -1) {
            return filePath.substring(0, lastDotIndex);
        }
        return filePath;
    }

    public Memento save(){
       Date date = Date.from(Instant.now());
      
      return new Memento(date.toString(), date, filePath, fileFormat);
    }


    public void restore(InterfaceMemento memento){
    Memento concreteMemento = (Memento) memento; // fazendo o casting da interface para o ConcreteMemento
    this.filePath = concreteMemento.getFilePath();
    this.fileFormat = concreteMemento.getFileFormat();
    }

    @Override
    public String toString() {
      return "ImageEditor [filePath=" + filePath + ", fileFormat=" + fileFormat + "]";
    }

   
   
}
