package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted494 extends Strategy 
{ 
  public static final lifted494 instance = new lifted494();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1122:
    { 
      IStrategoTerm a_474 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1122;
      a_474 = term.getSubterm(0);
      term = try_1_0.instance.invoke(context, a_474, comp_desugarings_to_str_0_0.instance);
      if(term == null)
        break Fail1122;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}