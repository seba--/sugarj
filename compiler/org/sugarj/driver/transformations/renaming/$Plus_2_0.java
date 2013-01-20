package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_2_0 extends Strategy 
{ 
  public static $Plus_2_0 instance = new $Plus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_37, Strategy j_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_2_0");
    Fail169:
    { 
      IStrategoTerm w_163 = null;
      IStrategoTerm q_163 = null;
      IStrategoTerm r_163 = null;
      IStrategoTerm x_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      q_163 = term.getSubterm(0);
      r_163 = term.getSubterm(1);
      IStrategoList annos139 = term.getAnnotations();
      w_163 = annos139;
      term = i_37.invoke(context, q_163);
      if(term == null)
        break Fail169;
      x_163 = term;
      term = j_37.invoke(context, r_163);
      if(term == null)
        break Fail169;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPlus_2, new IStrategoTerm[]{x_163, term}), checkListAnnos(termFactory, w_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}