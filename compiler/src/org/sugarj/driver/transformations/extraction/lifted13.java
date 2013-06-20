package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted13 extends Strategy 
{ 
  public static final lifted13 instance = new lifted13();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail284:
    { 
      IStrategoTerm m_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conseditor_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail284;
      m_150 = term.getSubterm(0);
      term = (IStrategoTerm)termFactory.makeListCons(m_150, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}