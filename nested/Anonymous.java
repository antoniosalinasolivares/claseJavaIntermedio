public class Anonymous{
  public static void main(String[] args){
    System.out.println("This is an prebe that suffers");
    Suffer prebe = new Suffer(){
      public void groan(){
        System.out.println("We no dormi :(");
      }
      public void cry(){
        System.out.println("Es mucha tarea");
      }
      public String scream(){
        return "ME LLEVA LA BERGAAAAAA";
      }
    };

    prebe.cry();
    prebe.groan();
    System.out.println(prebe.scream());
  }
}

