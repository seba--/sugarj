package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_12, Strategy x_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail52:
    { 
      IStrategoTerm l_98 = null;
      IStrategoTerm i_98 = null;
      IStrategoTerm j_98 = null;
      IStrategoTerm n_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      i_98 = term.getSubterm(0);
      j_98 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      l_98 = annos43;
      term = w_12.invoke(context, i_98);
      if(term == null)
        break Fail52;
      n_98 = term;
      term = x_12.invoke(context, j_98);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefNoArgs_2, new IStrategoTerm[]{n_98, term}), checkListAnnos(termFactory, l_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}