package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$No$Args_1_0 extends Strategy 
{ 
  public static $R$Dec$No$Args_1_0 instance = new $R$Dec$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail13:
    { 
      IStrategoTerm m_89 = null;
      IStrategoTerm l_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail13;
      l_89 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      m_89 = annos3;
      term = z_9.invoke(context, l_89);
      if(term == null)
        break Fail13;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}