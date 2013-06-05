package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Specification_1_0 extends Strategy 
{ 
  public static $Specification_1_0 instance = new $Specification_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Specification_1_0");
    Fail72:
    { 
      IStrategoTerm m_110 = null;
      IStrategoTerm l_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSpecification_1 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      l_110 = term.getSubterm(0);
      IStrategoList annos45 = term.getAnnotations();
      m_110 = annos45;
      term = r_18.invoke(context, l_110);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSpecification_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}