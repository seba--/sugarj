package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Group_2_0 extends Strategy 
{ 
  public static $Switch$Group_2_0 instance = new $Switch$Group_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_19, Strategy n_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchGroup_2_0");
    Fail73:
    { 
      IStrategoTerm p_112 = null;
      IStrategoTerm n_112 = null;
      IStrategoTerm o_112 = null;
      IStrategoTerm q_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchGroup_2 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      n_112 = term.getSubterm(0);
      o_112 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      p_112 = annos58;
      term = m_19.invoke(context, n_112);
      if(term == null)
        break Fail73;
      q_112 = term;
      term = n_19.invoke(context, o_112);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchGroup_2, new IStrategoTerm[]{q_112, term}), checkListAnnos(termFactory, p_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}