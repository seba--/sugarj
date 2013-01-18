package org.sugarj.util;

import java.io.Serializable;

public class Pair<A, B> implements Serializable {
  private static final long serialVersionUID = 2566823463317111600L;

  public A a;
  public B b;
  
  public Pair (A a, B b) {
    this.a = a;
    this.b = b;
  }
  
  public static <A, B> Pair<A, B> create(A a, B b) {
    return new Pair<A, B>(a, b);
  }
  
  public String toString() {
    return "(" + a.toString() + ", " + b.toString() + ")";
  }
}
