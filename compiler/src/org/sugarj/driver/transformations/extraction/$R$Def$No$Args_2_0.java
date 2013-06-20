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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_18, Strategy c_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail60:
    { 
      IStrategoTerm s_108 = null;
      IStrategoTerm q_108 = null;
      IStrategoTerm r_108 = null;
      IStrategoTerm t_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      q_108 = term.getSubterm(0);
      r_108 = term.getSubterm(1);
      IStrategoList annos33 = term.getAnnotations();
      s_108 = annos33;
      term = b_18.invoke(context, q_108);
      if(term == null)
        break Fail60;
      t_108 = term;
      term = c_18.invoke(context, r_108);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRDefNoArgs_2, new IStrategoTerm[]{t_108, term}), checkListAnnos(termFactory, s_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}