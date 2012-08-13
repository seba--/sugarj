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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_29, Strategy x_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Invoke_2_0");
    Fail194:
    { 
      IStrategoTerm q_144 = null;
      IStrategoTerm m_144 = null;
      IStrategoTerm p_144 = null;
      IStrategoTerm r_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInvoke_2 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      m_144 = term.getSubterm(0);
      p_144 = term.getSubterm(1);
      IStrategoList annos169 = term.getAnnotations();
      q_144 = annos169;
      term = w_29.invoke(context, m_144);
      if(term == null)
        break Fail194;
      r_144 = term;
      term = x_29.invoke(context, p_144);
      if(term == null)
        break Fail194;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInvoke_2, new IStrategoTerm[]{r_144, term}), checkListAnnos(termFactory, q_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}