package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt$Eq_2_0 extends Strategy 
{ 
  public static $Gt$Eq_2_0 instance = new $Gt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_36, Strategy t_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GtEq_2_0");
    Fail161:
    { 
      IStrategoTerm a_161 = null;
      IStrategoTerm y_160 = null;
      IStrategoTerm z_160 = null;
      IStrategoTerm b_161 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail161;
      y_160 = term.getSubterm(0);
      z_160 = term.getSubterm(1);
      IStrategoList annos131 = term.getAnnotations();
      a_161 = annos131;
      term = s_36.invoke(context, y_160);
      if(term == null)
        break Fail161;
      b_161 = term;
      term = t_36.invoke(context, z_160);
      if(term == null)
        break Fail161;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGtEq_2, new IStrategoTerm[]{b_161, term}), checkListAnnos(termFactory, a_161));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}