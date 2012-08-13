package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$And_2_0 extends Strategy 
{ 
  public static $Lazy$And_2_0 instance = new $Lazy$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_28, Strategy f_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyAnd_2_0");
    Fail168:
    { 
      IStrategoTerm s_137 = null;
      IStrategoTerm q_137 = null;
      IStrategoTerm r_137 = null;
      IStrategoTerm t_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      q_137 = term.getSubterm(0);
      r_137 = term.getSubterm(1);
      IStrategoList annos143 = term.getAnnotations();
      s_137 = annos143;
      term = e_28.invoke(context, q_137);
      if(term == null)
        break Fail168;
      t_137 = term;
      term = f_28.invoke(context, r_137);
      if(term == null)
        break Fail168;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyAnd_2, new IStrategoTerm[]{t_137, term}), checkListAnnos(termFactory, s_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}