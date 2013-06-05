package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  public static final lifted9 instance = new lifted9();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail285:
    { 
      IStrategoTerm f_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail285;
      f_150 = term.getSubterm(0);
      term = try_1_0.instance.invoke(context, f_150, comp_desugarings_to_str_0_0.instance);
      if(term == null)
        break Fail285;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}