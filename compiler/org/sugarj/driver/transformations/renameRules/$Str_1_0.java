package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str_1_0 extends Strategy 
{ 
  public static $Str_1_0 instance = new $Str_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Str_1_0");
    Fail140:
    { 
      IStrategoTerm n_114 = null;
      IStrategoTerm m_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      m_114 = term.getSubterm(0);
      IStrategoList annos130 = term.getAnnotations();
      n_114 = annos130;
      term = o_18.invoke(context, m_114);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}