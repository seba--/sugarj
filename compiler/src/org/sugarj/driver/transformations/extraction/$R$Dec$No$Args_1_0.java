package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail39:
    { 
      IStrategoTerm k_104 = null;
      IStrategoTerm j_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      j_104 = term.getSubterm(0);
      IStrategoList annos12 = term.getAnnotations();
      k_104 = annos12;
      term = m_16.invoke(context, j_104);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}