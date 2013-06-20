package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule_2_0 instance = new $Set$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_10, Strategy a_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail23:
    { 
      IStrategoTerm s_92 = null;
      IStrategoTerm m_92 = null;
      IStrategoTerm n_92 = null;
      IStrategoTerm t_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      m_92 = term.getSubterm(0);
      n_92 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      s_92 = annos14;
      term = z_10.invoke(context, m_92);
      if(term == null)
        break Fail23;
      t_92 = term;
      term = a_11.invoke(context, n_92);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRule_2, new IStrategoTerm[]{t_92, term}), checkListAnnos(termFactory, s_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}