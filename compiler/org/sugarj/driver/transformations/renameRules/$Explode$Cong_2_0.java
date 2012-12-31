package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_14, Strategy u_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail72:
    { 
      IStrategoTerm n_103 = null;
      IStrategoTerm l_103 = null;
      IStrategoTerm m_103 = null;
      IStrategoTerm o_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      l_103 = term.getSubterm(0);
      m_103 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      n_103 = annos66;
      term = t_14.invoke(context, l_103);
      if(term == null)
        break Fail72;
      o_103 = term;
      term = u_14.invoke(context, m_103);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplodeCong_2, new IStrategoTerm[]{o_103, term}), checkListAnnos(termFactory, n_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}