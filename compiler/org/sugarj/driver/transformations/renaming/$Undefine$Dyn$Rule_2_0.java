package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_10, Strategy w_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail25:
    { 
      IStrategoTerm n_92 = null;
      IStrategoTerm l_92 = null;
      IStrategoTerm m_92 = null;
      IStrategoTerm s_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      l_92 = term.getSubterm(0);
      m_92 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      n_92 = annos15;
      term = v_10.invoke(context, l_92);
      if(term == null)
        break Fail25;
      s_92 = term;
      term = w_10.invoke(context, m_92);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consUndefineDynRule_2, new IStrategoTerm[]{s_92, term}), checkListAnnos(termFactory, n_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}