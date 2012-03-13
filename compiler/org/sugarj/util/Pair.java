package org.sugarj.util;

import java.io.Serializable;

public class Pair<A, B> implements Serializable {
  private static final long serialVersionUID = -2536810397786380670L;

  public final A a;
  public final B b;
  
  public Pair (A a, B b) {
    this.a = a;
    this.b = b;
  }
  
  public static <A, B> Pair<A, B> create(A a, B b) {
    return new Pair<A,B>(a, b);
  }
  
  public String toString() {
    return "(" + a.toString() + ", " + b.toString() + ")";
  }
  
  public int hashCode() {
    return a.hashCode() + b.hashCode();
  }
  
  @SuppressWarnings("rawtypes")
  public boolean equals(Object o) {
    return o instanceof Pair &&
           ((Pair) o).a.equals(a) &&
           ((Pair) o).b.equals(b);
  }
}
