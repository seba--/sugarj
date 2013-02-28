package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$T_3_0 extends Strategy 
{ 
  public static $R$Dec$T_3_0 instance = new $R$Dec$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_9, Strategy y_9, Strategy z_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail11:
    { 
      IStrategoTerm c_89 = null;
      IStrategoTerm z_88 = null;
      IStrategoTerm a_89 = null;
      IStrategoTerm b_89 = null;
      IStrategoTerm f_89 = null;
      IStrategoTerm g_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      z_88 = term.getSubterm(0);
      a_89 = term.getSubterm(1);
      b_89 = term.getSubterm(2);
      IStrategoList annos1 = term.getAnnotations();
      c_89 = annos1;
      term = x_9.invoke(context, z_88);
      if(term == null)
        break Fail11;
      f_89 = term;
      term = y_9.invoke(context, a_89);
      if(term == null)
        break Fail11;
      g_89 = term;
      term = z_9.invoke(context, b_89);
      if(term == null)
        break Fail11;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecT_3, new IStrategoTerm[]{f_89, g_89, term}), checkListAnnos(termFactory, c_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}