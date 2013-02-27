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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_9, Strategy v_9, Strategy w_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail11:
    { 
      IStrategoTerm z_88 = null;
      IStrategoTerm t_88 = null;
      IStrategoTerm u_88 = null;
      IStrategoTerm x_88 = null;
      IStrategoTerm a_89 = null;
      IStrategoTerm b_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      t_88 = term.getSubterm(0);
      u_88 = term.getSubterm(1);
      x_88 = term.getSubterm(2);
      IStrategoList annos1 = term.getAnnotations();
      z_88 = annos1;
      term = u_9.invoke(context, t_88);
      if(term == null)
        break Fail11;
      a_89 = term;
      term = v_9.invoke(context, u_88);
      if(term == null)
        break Fail11;
      b_89 = term;
      term = w_9.invoke(context, x_88);
      if(term == null)
        break Fail11;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecT_3, new IStrategoTerm[]{a_89, b_89, term}), checkListAnnos(termFactory, z_88));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}