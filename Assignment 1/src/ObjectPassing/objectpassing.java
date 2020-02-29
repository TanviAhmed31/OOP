/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassing;

/**
 *
 * @author donlo
 */
class var{
   String name;
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
}

public class objectpassing {
    static int k  = 2020;
   static void passPrimitive(int j) {
      System.out.println("Before(Pass by Value) : " + j);
      j = j + 1;
   }
   static void  passReference(var emp) {
      var reference = emp;
      System.out.println("Before(Pass by Reference) : "+ emp.getName());
      reference.setName("hello");
   }
   public static void main(String[] args) {
      var ref = new var();
      ref.setName("world");
      passPrimitive(k);
      System.out.println("After(Pass by Value)  : "+ k);
      passReference(ref);
      System.out.println("After(Pass by Reference) :  "+ ref.getName());
   }
}
