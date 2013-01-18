package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Checks$Dec$Head_2_0 extends Strategy 
{ 
  public static $Checks$Dec$Head_2_0 instance = new $Checks$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_27, Strategy m_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ChecksDecHead_2_0");
    Fail39:
    { 
      IStrategoTerm s_126 = null;
      IStrategoTerm q_126 = null;
      IStrategoTerm r_126 = null;
      IStrategoTerm t_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChecksDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      q_126 = term.getSubterm(0);
      r_126 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      s_126 = annos16;
      term = l_27.invoke(context, q_126);
      if(term == null)
        break Fail39;
      t_126 = term;
      term = m_27.invoke(context, r_126);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChecksDecHead_2, new IStrategoTerm[]{t_126, term}), checkListAnnos(termFactory, s_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}