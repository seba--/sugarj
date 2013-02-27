package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$No$Args_1_0 extends Strategy 
{ 
  public static $Sort$No$Args_1_0 instance = new $Sort$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortNoArgs_1_0");
    Fail125:
    { 
      IStrategoTerm t_111 = null;
      IStrategoTerm s_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      s_111 = term.getSubterm(0);
      IStrategoList annos112 = term.getAnnotations();
      t_111 = annos112;
      term = o_17.invoke(context, s_111);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}