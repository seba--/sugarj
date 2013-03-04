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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortNoArgs_1_0");
    Fail359:
    { 
      IStrategoTerm a_196 = null;
      IStrategoTerm z_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail359;
      z_195 = term.getSubterm(0);
      IStrategoList annos303 = term.getAnnotations();
      a_196 = annos303;
      term = c_48.invoke(context, z_195);
      if(term == null)
        break Fail359;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}