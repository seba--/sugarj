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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortNoArgs_1_0");
    Fail948:
    { 
      IStrategoTerm a_455 = null;
      IStrategoTerm z_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSortNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail948;
      z_454 = term.getSubterm(0);
      IStrategoList annos191 = term.getAnnotations();
      a_455 = annos191;
      term = t_345.invoke(context, z_454);
      if(term == null)
        break Fail948;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSortNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_455));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}