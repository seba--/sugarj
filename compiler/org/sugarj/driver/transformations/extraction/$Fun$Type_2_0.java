package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_23, Strategy h_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail138:
    { 
      IStrategoTerm l_123 = null;
      IStrategoTerm j_123 = null;
      IStrategoTerm k_123 = null;
      IStrategoTerm m_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      j_123 = term.getSubterm(0);
      k_123 = term.getSubterm(1);
      IStrategoList annos108 = term.getAnnotations();
      l_123 = annos108;
      term = g_23.invoke(context, j_123);
      if(term == null)
        break Fail138;
      m_123 = term;
      term = h_23.invoke(context, k_123);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consFunType_2, new IStrategoTerm[]{m_123, term}), checkListAnnos(termFactory, l_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}