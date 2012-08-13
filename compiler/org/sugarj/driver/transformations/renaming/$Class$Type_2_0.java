package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Type_2_0 extends Strategy 
{ 
  public static $Class$Type_2_0 instance = new $Class$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_30, Strategy s_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassType_2_0");
    Fail204:
    { 
      IStrategoTerm y_147 = null;
      IStrategoTerm t_147 = null;
      IStrategoTerm u_147 = null;
      IStrategoTerm z_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      t_147 = term.getSubterm(0);
      u_147 = term.getSubterm(1);
      IStrategoList annos178 = term.getAnnotations();
      y_147 = annos178;
      term = r_30.invoke(context, t_147);
      if(term == null)
        break Fail204;
      z_147 = term;
      term = s_30.invoke(context, u_147);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassType_2, new IStrategoTerm[]{z_147, term}), checkListAnnos(termFactory, y_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}