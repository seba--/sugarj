package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Args_1_0 extends Strategy 
{ 
  public static $Type$Args_1_0 instance = new $Type$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeArgs_1_0");
    Fail202:
    { 
      IStrategoTerm m_170 = null;
      IStrategoTerm l_170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      l_170 = term.getSubterm(0);
      IStrategoList annos171 = term.getAnnotations();
      m_170 = annos171;
      term = k_39.invoke(context, l_170);
      if(term == null)
        break Fail202;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_170));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}