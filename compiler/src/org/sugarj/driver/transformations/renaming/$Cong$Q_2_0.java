package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cong$Q_2_0 extends Strategy 
{ 
  public static $Cong$Q_2_0 instance = new $Cong$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_15, Strategy i_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail81:
    { 
      IStrategoTerm s_104 = null;
      IStrategoTerm q_104 = null;
      IStrategoTerm r_104 = null;
      IStrategoTerm t_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      q_104 = term.getSubterm(0);
      r_104 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      s_104 = annos71;
      term = h_15.invoke(context, q_104);
      if(term == null)
        break Fail81;
      t_104 = term;
      term = i_15.invoke(context, r_104);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCongQ_2, new IStrategoTerm[]{t_104, term}), checkListAnnos(termFactory, s_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}