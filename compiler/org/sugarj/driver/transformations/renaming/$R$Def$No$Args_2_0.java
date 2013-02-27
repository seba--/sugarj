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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_11, Strategy s_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail34:
    { 
      IStrategoTerm w_94 = null;
      IStrategoTerm u_94 = null;
      IStrategoTerm v_94 = null;
      IStrategoTerm y_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      u_94 = term.getSubterm(0);
      v_94 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      w_94 = annos24;
      term = r_11.invoke(context, u_94);
      if(term == null)
        break Fail34;
      y_94 = term;
      term = s_11.invoke(context, v_94);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefNoArgs_2, new IStrategoTerm[]{y_94, term}), checkListAnnos(termFactory, w_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}