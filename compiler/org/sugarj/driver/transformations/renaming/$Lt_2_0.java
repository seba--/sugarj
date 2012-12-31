package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_36, Strategy z_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail164:
    { 
      IStrategoTerm t_161 = null;
      IStrategoTerm q_161 = null;
      IStrategoTerm s_161 = null;
      IStrategoTerm v_161 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      q_161 = term.getSubterm(0);
      s_161 = term.getSubterm(1);
      IStrategoList annos134 = term.getAnnotations();
      t_161 = annos134;
      term = y_36.invoke(context, q_161);
      if(term == null)
        break Fail164;
      v_161 = term;
      term = z_36.invoke(context, s_161);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLt_2, new IStrategoTerm[]{v_161, term}), checkListAnnos(termFactory, t_161));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}