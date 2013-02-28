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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_12, Strategy u_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail53:
    { 
      IStrategoTerm h_98 = null;
      IStrategoTerm f_98 = null;
      IStrategoTerm g_98 = null;
      IStrategoTerm i_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      f_98 = term.getSubterm(0);
      g_98 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      h_98 = annos43;
      term = t_12.invoke(context, f_98);
      if(term == null)
        break Fail53;
      i_98 = term;
      term = u_12.invoke(context, g_98);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefNoArgs_2, new IStrategoTerm[]{i_98, term}), checkListAnnos(termFactory, h_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}