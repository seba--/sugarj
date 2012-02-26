package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Invoke_2_0 extends Strategy 
{ 
  public static $Invoke_2_0 instance = new $Invoke_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_24, Strategy m_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Invoke_2_0");
    Fail146:
    { 
      IStrategoTerm q_126 = null;
      IStrategoTerm o_126 = null;
      IStrategoTerm p_126 = null;
      IStrategoTerm r_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      o_126 = term.getSubterm(0);
      p_126 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      q_126 = annos128;
      term = l_24.invoke(context, o_126);
      if(term == null)
        break Fail146;
      r_126 = term;
      term = m_24.invoke(context, p_126);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInvoke_2, new IStrategoTerm[]{r_126, term}), checkListAnnos(termFactory, q_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}