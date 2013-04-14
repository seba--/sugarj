package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_18, Strategy g_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail134:
    { 
      IStrategoTerm g_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      IStrategoTerm i_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      e_113 = term.getSubterm(0);
      f_113 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      g_113 = annos121;
      term = f_18.invoke(context, e_113);
      if(term == null)
        break Fail134;
      i_113 = term;
      term = g_18.invoke(context, f_113);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAs_2, new IStrategoTerm[]{i_113, term}), checkListAnnos(termFactory, g_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}