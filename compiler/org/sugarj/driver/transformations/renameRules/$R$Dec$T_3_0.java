package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_9, Strategy w_9, Strategy x_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail7:
    { 
      IStrategoTerm a_89 = null;
      IStrategoTerm u_88 = null;
      IStrategoTerm x_88 = null;
      IStrategoTerm z_88 = null;
      IStrategoTerm b_89 = null;
      IStrategoTerm c_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail7;
      u_88 = term.getSubterm(0);
      x_88 = term.getSubterm(1);
      z_88 = term.getSubterm(2);
      IStrategoList annos1 = term.getAnnotations();
      a_89 = annos1;
      term = v_9.invoke(context, u_88);
      if(term == null)
        break Fail7;
      b_89 = term;
      term = w_9.invoke(context, x_88);
      if(term == null)
        break Fail7;
      c_89 = term;
      term = x_9.invoke(context, z_88);
      if(term == null)
        break Fail7;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDecT_3, new IStrategoTerm[]{b_89, c_89, term}), checkListAnnos(termFactory, a_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}