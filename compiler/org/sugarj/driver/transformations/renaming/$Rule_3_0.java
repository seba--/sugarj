package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule_3_0 extends Strategy 
{ 
  public static $Rule_3_0 instance = new $Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_11, Strategy j_11, Strategy k_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail29:
    { 
      IStrategoTerm x_93 = null;
      IStrategoTerm t_93 = null;
      IStrategoTerm u_93 = null;
      IStrategoTerm w_93 = null;
      IStrategoTerm y_93 = null;
      IStrategoTerm z_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      t_93 = term.getSubterm(0);
      u_93 = term.getSubterm(1);
      w_93 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      x_93 = annos20;
      term = i_11.invoke(context, t_93);
      if(term == null)
        break Fail29;
      y_93 = term;
      term = j_11.invoke(context, u_93);
      if(term == null)
        break Fail29;
      z_93 = term;
      term = k_11.invoke(context, w_93);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRule_3, new IStrategoTerm[]{y_93, z_93, term}), checkListAnnos(termFactory, x_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}