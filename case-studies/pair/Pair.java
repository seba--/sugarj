package pair;

public class Pair<A, B> {
  public A a;
  public B b;
  
  public Pair (A a, B b) {
    this.a = a;
    this.b = b;
  }
  
  public String toString() {
    return "(" + a.toString() + ", " + b.toString() + ")";
  }
}
