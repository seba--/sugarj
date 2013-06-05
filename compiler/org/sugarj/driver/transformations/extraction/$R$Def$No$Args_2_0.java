package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def$No$Args_2_0 extends Strategy 
{ 
  public static $R$Def$No$Args_2_0 instance = new $R$Def$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_17, Strategy a_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail59:
    { 
      IStrategoTerm n_108 = null;
      IStrategoTerm l_108 = null;
      IStrategoTerm m_108 = null;
      IStrategoTerm o_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      l_108 = term.getSubterm(0);
      m_108 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      n_108 = annos32;
      term = z_17.invoke(context, l_108);
      if(term == null)
        break Fail59;
      o_108 = term;
      term = a_18.invoke(context, m_108);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRDefNoArgs_2, new IStrategoTerm[]{o_108, term}), checkListAnnos(termFactory, n_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}