package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_42, Strategy i_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail271:
    { 
      IStrategoTerm q_179 = null;
      IStrategoTerm o_179 = null;
      IStrategoTerm p_179 = null;
      IStrategoTerm r_179 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail271;
      o_179 = term.getSubterm(0);
      p_179 = term.getSubterm(1);
      IStrategoList annos218 = term.getAnnotations();
      q_179 = annos218;
      term = h_42.invoke(context, o_179);
      if(term == null)
        break Fail271;
      r_179 = term;
      term = i_42.invoke(context, p_179);
      if(term == null)
        break Fail271;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefNoArgs_2, new IStrategoTerm[]{r_179, term}), checkListAnnos(termFactory, q_179));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}