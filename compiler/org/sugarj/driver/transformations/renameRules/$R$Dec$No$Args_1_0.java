package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail9:
    { 
      IStrategoTerm n_89 = null;
      IStrategoTerm m_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail9;
      m_89 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      n_89 = annos3;
      term = a_10.invoke(context, m_89);
      if(term == null)
        break Fail9;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}