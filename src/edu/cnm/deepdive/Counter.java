package edu.cnm.deepdive;

public class Counter {

  public static int count;
  public int anotherCount;

  public Counter() {
    count++;
    anotherCount++;
  }

  public static void main(String[] args) {
    Counter one = new Counter();
    Counter two = new Counter();
    Counter three = new Counter();
    Counter four = new Counter();

    System.out.println(count);//this will print five times the number 4. Every time we created a new
    System.out.println(one.count);//instance as in line 14 -17 the constructor incremented count on
    System.out.println(two.count);//line 9 with 1. Since static fields are shared between the instances
    System.out.println(three.count);//every instance will print 4.
    System.out.println(four.count);

    System.out.println("\n" + one.anotherCount);//all four lines print 1.
    System.out.println(two.anotherCount);
    System.out.println(three.anotherCount);
    System.out.println(four.anotherCount);

    one.anotherCount = 2;
    two.anotherCount = 3;
    three.anotherCount = 4;
    four.anotherCount = 5;

    System.out.println("\n" + one.anotherCount);//prints 2
    System.out.println(two.anotherCount);//prints 3
    System.out.println(three.anotherCount);//prints 4
    System.out.println(four.anotherCount);//prints 5


  }

}
