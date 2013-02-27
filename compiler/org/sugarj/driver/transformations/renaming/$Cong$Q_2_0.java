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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_15, Strategy f_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail82:
    { 
      IStrategoTerm p_104 = null;
      IStrategoTerm n_104 = null;
      IStrategoTerm o_104 = null;
      IStrategoTerm q_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      n_104 = term.getSubterm(0);
      o_104 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      p_104 = annos71;
      term = e_15.invoke(context, n_104);
      if(term == null)
        break Fail82;
      q_104 = term;
      term = f_15.invoke(context, o_104);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCongQ_2, new IStrategoTerm[]{q_104, term}), checkListAnnos(termFactory, p_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}