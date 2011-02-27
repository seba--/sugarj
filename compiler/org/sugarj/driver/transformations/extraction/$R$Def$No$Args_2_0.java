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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_18, Strategy b_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefNoArgs_2_0");
    Fail47:
    { 
      IStrategoTerm k_108 = null;
      IStrategoTerm i_108 = null;
      IStrategoTerm j_108 = null;
      IStrategoTerm l_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      i_108 = term.getSubterm(0);
      j_108 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      k_108 = annos24;
      term = a_18.invoke(context, i_108);
      if(term == null)
        break Fail47;
      l_108 = term;
      term = b_18.invoke(context, j_108);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRDefNoArgs_2, new IStrategoTerm[]{l_108, term}), checkListAnnos(termFactory, k_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}