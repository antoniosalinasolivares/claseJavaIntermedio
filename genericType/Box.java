//    Box class                                                       //
//    This class only serves as literally a box to a said datatype    //
//    it stores a variable of the Type that was given in definition   //
//    and it has get-setters to access them                           //
public class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
     
      //We instantiate two boxes with a different datatype each
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      //We use their methods to asign values according to the type we assigned
      //them
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));
      
      //We use the methods to access them
      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
}
