//Nested Classes is as easy as defining one class inside anotherr 
//however, there a a multiple configuration in which this may come in handy
//for example, a static class defined inside another class only gives it a 
//more structured appearance

//An inner class is NOT a static class, it is linked to an instance and it hass
//access to all the methods and fields, however, since it is linked to an
//instance it cannot create any static instances.


public class localExample{
  public static void main(String[] args){
    Outer obj = new Outer("Bob", Color.RED);  
    System.out.println("Hey my name is "+ obj.getName() + " and I am " + obj.getStatus());
  }
}



//    Outer Class definition   //
class Outer{
  
  //    fields    //
  String name;
  String status;
  //    Constructor    //
  Outer(String objectName, Color cl){
    this.name = objectName;
    
  
    //    Inner Class definition  //
    class Inner{
      private void validate(){
        switch(cl){
        
        case RED: Outer.this.setState("Cool");
          break;
        case GREEN: Outer.this.setState("Immature");
          break;
        case BLUE: Outer.this.setState("Chill");
          break;
        case YELLOW: Outer.this.setState("Empowered");
          break;
        case ORANGE: Outer.this.setState("Hungry");
          break;
        case PINK: Outer.this.setState("Soft");
          break;
        }
      }
    }
    
    new Inner().validate();

  }
  
  //    get-setters   //

  public String getName(){
    return this.name;
  }
  
  public void setName(String newName){
    this.name = newName;
  } 
  
  public String getStatus(){
    return this.status;
  }
  
  public void setState(String newStatus){
    this.status = newStatus;
  } 

}
