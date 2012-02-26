package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Bool_1_0 extends Strategy 
{ 
  public static $Bool_1_0 instance = new $Bool_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Bool_1_0");
    Fail191:
    { 
      IStrategoTerm d_135 = null;
      IStrategoTerm b_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBool_1 != ((IStrategoAppl)term).getConstructor())
        break Fail191;
      b_135 = term.getSubterm(0);
      IStrategoList annos161 = term.getAnnotations();
      d_135 = annos161;
      term = m_26.invoke(context, b_135);
      if(term == null)
        break Fail191;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBool_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}