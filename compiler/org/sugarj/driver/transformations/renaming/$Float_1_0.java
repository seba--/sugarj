package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Float_1_0 extends Strategy 
{ 
  public static $Float_1_0 instance = new $Float_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Float_1_0");
    Fail240:
    { 
      IStrategoTerm n_151 = null;
      IStrategoTerm m_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFloat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail240;
      m_151 = term.getSubterm(0);
      IStrategoList annos203 = term.getAnnotations();
      n_151 = annos203;
      term = y_31.invoke(context, m_151);
      if(term == null)
        break Fail240;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFloat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}