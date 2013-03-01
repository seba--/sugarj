package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Synchronized_2_0 extends Strategy 
{ 
  public static $Synchronized_2_0 instance = new $Synchronized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_33, Strategy p_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Synchronized_2_0");
    Fail115:
    { 
      IStrategoTerm q_149 = null;
      IStrategoTerm o_149 = null;
      IStrategoTerm p_149 = null;
      IStrategoTerm r_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSynchronized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      o_149 = term.getSubterm(0);
      p_149 = term.getSubterm(1);
      IStrategoList annos88 = term.getAnnotations();
      q_149 = annos88;
      term = o_33.invoke(context, o_149);
      if(term == null)
        break Fail115;
      r_149 = term;
      term = p_33.invoke(context, p_149);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSynchronized_2, new IStrategoTerm[]{r_149, term}), checkListAnnos(termFactory, q_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}