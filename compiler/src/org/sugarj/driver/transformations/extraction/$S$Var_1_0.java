package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Var_1_0 extends Strategy 
{ 
  public static $S$Var_1_0 instance = new $S$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail138:
    { 
      IStrategoTerm m_123 = null;
      IStrategoTerm l_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      l_123 = term.getSubterm(0);
      IStrategoList annos108 = term.getAnnotations();
      m_123 = annos108;
      term = h_23.invoke(context, l_123);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}