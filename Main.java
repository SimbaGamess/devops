/**
* yeah just for testing
*/

public class Main{
  public void main(String[] args){
    new Main();
  }
  public Main(){
    outPrint(buildingString);
  }
private String buildString(){
  String builded = "";
  builded += "Hello ";
  builded += "World!";
  return builded;
}
  
  private void outPrint(String printing){
    for (int i = 0; i < printing.length; i++){
      System.out.println(printing.charAt(i));
    }
  }
}
