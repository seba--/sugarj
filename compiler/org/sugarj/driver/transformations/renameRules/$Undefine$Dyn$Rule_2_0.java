package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Undefine$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Undefine$Dyn$Rule_2_0 instance = new $Undefine$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_10, Strategy x_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail21:
    { 
      IStrategoTerm s_92 = null;
      IStrategoTerm m_92 = null;
      IStrategoTerm n_92 = null;
      IStrategoTerm t_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      m_92 = term.getSubterm(0);
      n_92 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      s_92 = annos15;
      term = w_10.invoke(context, m_92);
      if(term == null)
        break Fail21;
      t_92 = term;
      term = x_10.invoke(context, n_92);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consUndefineDynRule_2, new IStrategoTerm[]{t_92, term}), checkListAnnos(termFactory, s_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}