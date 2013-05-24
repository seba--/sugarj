package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$No$Args_2_0 extends Strategy 
{ 
  public static $S$Def$No$Args_2_0 instance = new $S$Def$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_342, Strategy p_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail890:
    { 
      IStrategoTerm o_446 = null;
      IStrategoTerm m_446 = null;
      IStrategoTerm n_446 = null;
      IStrategoTerm p_446 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail890;
      m_446 = term.getSubterm(0);
      n_446 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      o_446 = annos136;
      term = o_342.invoke(context, m_446);
      if(term == null)
        break Fail890;
      p_446 = term;
      term = p_342.invoke(context, n_446);
      if(term == null)
        break Fail890;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSDefNoArgs_2, new IStrategoTerm[]{p_446, term}), checkListAnnos(termFactory, o_446));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}