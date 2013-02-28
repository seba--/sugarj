package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode$Cong_2_0 extends Strategy 
{ 
  public static $Explode$Cong_2_0 instance = new $Explode$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_14, Strategy w_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail76:
    { 
      IStrategoTerm p_103 = null;
      IStrategoTerm n_103 = null;
      IStrategoTerm o_103 = null;
      IStrategoTerm q_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      n_103 = term.getSubterm(0);
      o_103 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      p_103 = annos66;
      term = v_14.invoke(context, n_103);
      if(term == null)
        break Fail76;
      q_103 = term;
      term = w_14.invoke(context, o_103);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplodeCong_2, new IStrategoTerm[]{q_103, term}), checkListAnnos(termFactory, p_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}