package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $To$Model$Term_1_0 extends Strategy 
{ 
  public static $To$Model$Term_1_0 instance = new $To$Model$Term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ToModelTerm_1_0");
    Fail23:
    { 
      IStrategoTerm m_123 = null;
      IStrategoTerm l_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consToModelTerm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      l_123 = term.getSubterm(0);
      IStrategoList annos0 = term.getAnnotations();
      m_123 = annos0;
      term = j_26.invoke(context, l_123);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consToModelTerm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}