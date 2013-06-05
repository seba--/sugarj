package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortNoArgs_1_0");
    Fail150:
    { 
      IStrategoTerm t_125 = null;
      IStrategoTerm s_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSortNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      s_125 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      t_125 = annos120;
      term = z_23.invoke(context, s_125);
      if(term == null)
        break Fail150;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSortNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}