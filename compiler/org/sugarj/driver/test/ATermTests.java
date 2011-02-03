package org.sugarj.driver.test;

import static org.junit.Assert.assertEquals;
import static org.sugarj.driver.ATermCommands.extractString;
import static org.sugarj.driver.ATermCommands.extractTerm;
import static org.sugarj.driver.ATermCommands.factory;

import org.junit.Test;
import org.sugarj.driver.ATermCommands;


import aterm.ATerm;

public class ATermTests {

  ATerm scrutinee1 = factory.parse("A(B, \"c\")");
  ATerm scrutinee2 = factory.parse("A([B, B], \"c\")");
  ATerm b = factory.parse("B");
  ATerm c = factory.parse("\"c\"");
  String str = "c";
  ATerm list = factory.parse("[B, B]");
  
  // ATerm scrutinee2 = factory.parse("PackageDec([A, B, C], \"c\")

  @Test
  public final void extractTerm_1() {
    assertEquals(scrutinee1, extractTerm(scrutinee1, "?"));
  }
  
  @Test
  public final void extractTerm_2() {
    assertEquals(b, extractTerm(scrutinee1, "A(?, _)"));
  }

  @Test
  public final void extractTerm_3() {
    assertEquals(b, extractTerm(scrutinee1, "A(?, \"c\")"));
  }

  @Test
  public final void extractTerm_4() {
    assertEquals(c, extractTerm(scrutinee1, "A(_, ?)"));  
  }

  @Test
  public final void extractTerm_5() {
    assertEquals(c, extractTerm(scrutinee1, "A(B, ?)"));  
  }

  @Test
  public final void extractTerm_6() {
    assertEquals(list, extractTerm(scrutinee2, "A(?, _)"));
  }

  @Test
  public final void extractTerm_7() {
    assertEquals(b, extractTerm(scrutinee2, "A([?,_], _)"));
  }
  
  @Test
  public final void extractString_1() {
    assertEquals(str, extractString(scrutinee1, "A(_, ?)"));  
  }

  @Test
  public final void extractString_2() {
    assertEquals(str, extractString(scrutinee1, "A(B, ?)"));  
  }
  
  @Test
  public final void extractString_3() {
    assertEquals(str, extractString(scrutinee2, "A(_, ?)"));
  }
  
  @Test (expected = ATermCommands.MatchError.class)
  public final void extractString_4() {
    extractString(scrutinee2, "A(?, _)");
  }

}
