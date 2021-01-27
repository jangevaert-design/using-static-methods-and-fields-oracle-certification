package edu.cnm.deepdive;

public class DogTester {

  public static void main(String[] args) {
    Dog husky = new Dog();
    System.out.println(husky.count);//we create an instance of the dog class and call the field in
    //the dog class on the instance. Prints 0 but doesn't make sense to create an instance when we
    //can call the field directly as shown below.
    System.out.println(Dog.count);//we call the Dog class directly since the field is static.
    //prints 0.

    Dog labrador = new Dog();
    labrador.incrementCounter();//we create an instance of the dog class and call the method in
    //the dog class on the instance. Doesn't make sense to create an instance when we
    //can call the method directly as shown below.
    Dog.incrementCounter();
    System.out.println("\n" + Dog.count);//prints 2 because we incremented with labrador and Dog.

    husky = null;
    labrador = null;

    System.out.println("\n" + Dog.count);
    System.out.println(husky.count);
    System.out.println(labrador.count);

    Dog.count = 10;
    Dog Nyx = new Dog();
    Dog Tigger = new Dog();
    Nyx.count = 5;
    System.out.println("\n" + Dog.count);//prints 5 because the field count has been set to 5 and will
    //be set to all the instance variables and even the class.
    System.out.println(Nyx.count);
    Tigger.count = 11;
    System.out.println("\n" + Nyx.count);//will print 11 because even we don't need to call a static method
    //on an instance, it will still be executed. when we set a static variable on one of the instances,
    //it will be set on all of the instances, exactly because it is static (or shared).
  }
}
