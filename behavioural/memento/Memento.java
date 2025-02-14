package behavioural.memento;

import java.util.Date;


// ESTE EH O CONCRATE MEMENTO
public class Memento implements InterfaceMemento {

  private String name;
  private Date date;
  private String filePath;
  private String fileFormat;

  public Memento(String name , Date date , String filePath , String fileFormat){
    this.name = name;
    this.date = date;
    this.fileFormat = fileFormat;
    this.filePath = filePath;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Date getDate() {
    return this.date;
  }

  // State no diagrama UML
  public String getFilePath(){
    return this.filePath;
  }

  // State no diagrama UML
  public String getFileFormat(){
    return this.fileFormat;
  }
  
}
