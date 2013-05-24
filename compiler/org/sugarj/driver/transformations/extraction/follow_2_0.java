package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class follow_2_0 extends Strategy 
{ 
  public static follow_2_0 instance = new follow_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_348, Strategy n_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("follow_2_0");
    Fail991:
    { 
      IStrategoTerm b_462 = null;
      IStrategoTerm z_461 = null;
      IStrategoTerm a_462 = null;
      IStrategoTerm c_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consfollow_2 != ((IStrategoAppl)term).getConstructor())
        break Fail991;
      z_461 = term.getSubterm(0);
      a_462 = term.getSubterm(1);
      IStrategoList annos231 = term.getAnnotations();
      b_462 = annos231;
      term = m_348.invoke(context, z_461);
      if(term == null)
        break Fail991;
      c_462 = term;
      term = n_348.invoke(context, a_462);
      if(term == null)
        break Fail991;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consfollow_2, new IStrategoTerm[]{c_462, term}), checkListAnnos(termFactory, b_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}