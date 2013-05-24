package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class foldl1_1_0 extends Strategy 
{ 
  public static foldl1_1_0 instance = new foldl1_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_50)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("foldl1_1_0");
    Fail7:
    { 
      IStrategoTerm o_50 = null;
      IStrategoTerm p_50 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail7;
      p_50 = ((IStrategoList)term).head();
      o_50 = ((IStrategoList)term).tail();
      term = termFactory.makeTuple(o_50, p_50);
      term = foldl_1_0.instance.invoke(context, term, q_50);
      if(term == null)
        break Fail7;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}