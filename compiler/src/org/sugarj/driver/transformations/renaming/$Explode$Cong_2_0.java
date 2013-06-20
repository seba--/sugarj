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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_14, Strategy z_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail75:
    { 
      IStrategoTerm s_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm r_103 = null;
      IStrategoTerm t_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      q_103 = term.getSubterm(0);
      r_103 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      s_103 = annos66;
      term = y_14.invoke(context, q_103);
      if(term == null)
        break Fail75;
      t_103 = term;
      term = z_14.invoke(context, r_103);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplodeCong_2, new IStrategoTerm[]{t_103, term}), checkListAnnos(termFactory, s_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}