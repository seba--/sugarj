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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Float_1_0");
    Fail230:
    { 
      IStrategoTerm n_173 = null;
      IStrategoTerm m_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFloat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail230;
      m_173 = term.getSubterm(0);
      IStrategoList annos188 = term.getAnnotations();
      n_173 = annos188;
      term = g_40.invoke(context, m_173);
      if(term == null)
        break Fail230;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFloat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}