public class A {
    public int pubvar;
    protected int protvar;
    private int privvar;
    public A(int pub, int prot, int priv) {
        pubvar = pub;
        protvar = prot;
        privvar = priv;
    }
    public int getPrivvar() {
        return privvar;
    }
}
package bpack;
import apack.A;
public class B extends A {
    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);
    }
    public void display() {
        System.out.println("Public variable = " + pubvar);
        System.out.println("Protected variable = " + protvar);
        System.out.println("Private variable = Not accessible");
    }
}
package cpack;
import apack.A;
public class C {
    public void display() {
        A obj = new A(10, 20, 30);
        System.out.println("Inside C:");
        System.out.println("Public variable = " + obj.pubvar);
        System.out.println("Protected variable = Not accessible");
        System.out.println("Private variable = Not accessible");
    }
}
package dpack;
import bpack.B;
import cpack.C;
public class Demo {
    public static void main(String[] args) {
        B b = new B(100, 200, 300);
        C c = new C();
        b.display();
        System.out.println();
        c.display();
    }
  }
