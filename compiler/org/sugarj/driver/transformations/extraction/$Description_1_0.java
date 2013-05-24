package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Description_1_0 extends Strategy 
{ 
  public static $Description_1_0 instance = new $Description_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Description_1_0");
    Fail825:
    { 
      IStrategoTerm m_435 = null;
      IStrategoTerm l_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDescription_1 != ((IStrategoAppl)term).getConstructor())
        break Fail825;
      l_435 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      m_435 = annos73;
      term = c_338.invoke(context, l_435);
      if(term == null)
        break Fail825;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDescription_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}