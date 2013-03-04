package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then_2_0 extends Strategy 
{ 
  public static $If$Then_2_0 instance = new $If$Then_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_44, Strategy w_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail304:
    { 
      IStrategoTerm p_186 = null;
      IStrategoTerm n_186 = null;
      IStrategoTerm o_186 = null;
      IStrategoTerm q_186 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail304;
      n_186 = term.getSubterm(0);
      o_186 = term.getSubterm(1);
      IStrategoList annos251 = term.getAnnotations();
      p_186 = annos251;
      term = v_44.invoke(context, n_186);
      if(term == null)
        break Fail304;
      q_186 = term;
      term = w_44.invoke(context, o_186);
      if(term == null)
        break Fail304;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIfThen_2, new IStrategoTerm[]{q_186, term}), checkListAnnos(termFactory, p_186));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}