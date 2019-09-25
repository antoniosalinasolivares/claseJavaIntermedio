class List<T>{
  public static void main(String[] args){
    List<String> stringlist = new List<String>();
    List<Integer> integerList = new List<Integer>();

    
    stringlist.addItem(new String("Pepe"));
    stringlist.addItem(new String("pecas"));
    stringlist.addItem(new String("Pica"));
    stringlist.addItem(new String("Papas"));

    integerList.addItem(new Integer(1));
    integerList.addItem(new Integer(2));
    integerList.addItem(new Integer(3));
    integerList.addItem(new Integer(4));
    integerList.addItem(new Integer(5));

    stringlist.printList();
    integerList.printList();
  }
  
  
  Node first;
  Node last;
  
  List(){
    this.first = null;
    this.last = null;
  }
  public void printList(){  
    class Printer{
      void work(Node node){
        System.out.print(node.printable());
        if(node.next == null){
          return;
        }
        else{
          System.out.print(",");
          this.work(node.next);
        }
      }
    }
    new Printer().work(this.first);
  }

  public boolean addItem(T value){
    try{
    if(this.first == null){
      this.first = new Node(value);
      this.last = this.first;
    }
    else{
      this.last.next = new Node(value);
      this.last = this.last.next;
      return true;
    }}catch(Exception e){
      return false;
    }
  return true;    
  }
  
  
  class Node{
    T value;
    Node next;

    Node(T newValue){
      this.value = newValue; 
      this.next = null;
    }

    public String printable(){
      return this.value.toString();
    }
  }

}
