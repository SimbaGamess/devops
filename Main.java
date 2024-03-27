/**
* yeah just for testing
*/

public class Main{
  public static void main(String[] args){
    new Main();
  }
  public Main(){
    outPrint(buildString());
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
