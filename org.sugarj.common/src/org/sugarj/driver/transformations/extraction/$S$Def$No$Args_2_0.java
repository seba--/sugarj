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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_19, Strategy d_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail67:
    { 
      IStrategoTerm s_111 = null;
      IStrategoTerm q_111 = null;
      IStrategoTerm r_111 = null;
      IStrategoTerm t_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      q_111 = term.getSubterm(0);
      r_111 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      s_111 = annos43;
      term = c_19.invoke(context, q_111);
      if(term == null)
        break Fail67;
      t_111 = term;
      term = d_19.invoke(context, r_111);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSDefNoArgs_2, new IStrategoTerm[]{t_111, term}), checkListAnnos(termFactory, s_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}