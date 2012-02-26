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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_25, Strategy h_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassType_2_0");
    Fail156:
    { 
      IStrategoTerm u_128 = null;
      IStrategoTerm s_128 = null;
      IStrategoTerm t_128 = null;
      IStrategoTerm v_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      s_128 = term.getSubterm(0);
      t_128 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      u_128 = annos137;
      term = g_25.invoke(context, s_128);
      if(term == null)
        break Fail156;
      v_128 = term;
      term = h_25.invoke(context, t_128);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassType_2, new IStrategoTerm[]{v_128, term}), checkListAnnos(termFactory, u_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}