//Nested Classes is as easy as defining one class inside anotherr 
//however, there a a multiple configuration in which this may come in handy
//for example, a static class defined inside another class only gives it a 
//more structured appearance

//An inner class is NOT a static class, it is linked to an instance and it hass
//access to all the methods and fields, however, since it is linked to an
//instance it cannot create any static instances.


public class innerExample{
  public static void main(String[] args){
   Outer.Inner obj = new Outer("Bob").new Inner();
   //Outer.Inner obj = new Outer.Inner();
  obj.show();
  obj.access();
  }
}


//    Outer Class definition   //
class Outer{
  
  //    fields    //
  String name;
  
  //    Constructor    //
  Outer(String objectName){
    this.name = objectName;
  }
  
  //    get-setters   //

  public String getName(){
    return this.name;
  }
  
  public void setName(String newName){
    this.name = newName;
  } 
  //    Inner Class definition  //
  class Inner{

    //    proof that it works    //
    public void show(){
      System.out.println("This is printed from inside the inner class!");
    }
    // static method test
    //public static void Nothing(){
    //  System.out.println("I do nothing!");
    //}
    
    //Access outer fields from inside
    void access(){
      //System.out.println("Hello, I'm an object linked to: "+Outer.getName());
      System.out.println("Hello, I'm an object linked to: "+Outer.this.getName());
    }

  }

}
