package edu.cnm.deepdive;

public class Static {

  private String name = "Static";


  public static void one() {}
  public static void two() {}
  public static void three() {
    one();//we can call a static method within another static method.
    two();
    //four(); we cannot call a non static method within a static method
    //System.out.println(name); we cannot call a non static field from a static method.
  }

  public void four() {
    one();//we can call static methods within a non static method (also called instance methods)
    two();
    System.out.println(name);// we can call fields within a non static method.
  }

  public static void main(String[] args) {
    Static.one();//this works but since we are in the same class we can do as on line 25:
    one();
    //four(); we cannot call method four() because that is not a static method.

    Static myInstance = new Static();
    myInstance.four();// we can call method four() after we created an instance from the Static class.

    //we can call method four() also directly after constructing as on line 32
    new Static().four();
  }
}
