//We import the nessesary classes to implement a List 
import java.util.Arrays;
import java.util.List;


class Unbounded{

  public static void main(String[] args){
    
    //We define a couple of lists of classes that inherit from Number
    List<Integer> list1 = Arrays.asList(8,11,13,10);
    List<Double> list2 = Arrays.asList(3.1459, 2.7182, 6.6740, 8.9875);
    List<Number> list3 = Arrays.asList(128,256,155,42);
    //We demonstrate that, within the same function we can pass attributes of
    //different classes
    System.out.println("The list1 is: "+printList(list1));
//    System.out.println("The list2 is: "+printList(list2));
    System.out.println("The list3 is: "+printList(list3));
  }
  
  //we create a method that receives a  upper bounded Number list
  private static String printList(List<?> list){
    return list.toString();
  }
}
