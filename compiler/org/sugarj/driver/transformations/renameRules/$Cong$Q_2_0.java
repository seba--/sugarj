package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_15, Strategy d_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail78:
    { 
      IStrategoTerm n_104 = null;
      IStrategoTerm l_104 = null;
      IStrategoTerm m_104 = null;
      IStrategoTerm o_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      l_104 = term.getSubterm(0);
      m_104 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      n_104 = annos71;
      term = c_15.invoke(context, l_104);
      if(term == null)
        break Fail78;
      o_104 = term;
      term = d_15.invoke(context, m_104);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCongQ_2, new IStrategoTerm[]{o_104, term}), checkListAnnos(termFactory, n_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}