//We import the nessesary classes to implement a List 
import java.util.Arrays;
import java.util.List;


class UpperBounded{

  public static void main(String[] args){
    
    //We define a couple of lists of classes that inherit from Number
    List<Integer> list1 = Arrays.asList(8,11,13,10);
    List<Double> list2 = Arrays.asList(3.1459, 2.7182, 6.6740, 8.9875);
    List<Number> list3 = Arrays.asList(128,256,155,42);
    //We demonstrate that, within the same function we can pass attributes of
    //different classes
    System.out.println("The average value of list1 is: "+average(list1));
    System.out.println("The average value of list2 is: "+average(list2));
    System.out.println("The average value of list3 is: "+average(list3));
  }
  
  //we create a method that receives a  upper bounded Number list
  private static double average(List<? extends Number> list){
    double sum = 0;
    double values = 0;
    //In this case, Number is the class of the item from which we are
    //inheriting, therefore, the items share the same methods of Number
    for (Number i: list){
      values +=1;
      sum +=i.doubleValue();
    }
    return sum/values;
  //Check https://docs.oracle.com/javase/8/docs/api/java/util/List.html for a
  //better implementation
  }
}
