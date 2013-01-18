package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt$Eq_2_0 extends Strategy 
{ 
  public static $Lt$Eq_2_0 instance = new $Lt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_36, Strategy v_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LtEq_2_0");
    Fail162:
    { 
      IStrategoTerm f_161 = null;
      IStrategoTerm d_161 = null;
      IStrategoTerm e_161 = null;
      IStrategoTerm g_161 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      d_161 = term.getSubterm(0);
      e_161 = term.getSubterm(1);
      IStrategoList annos132 = term.getAnnotations();
      f_161 = annos132;
      term = u_36.invoke(context, d_161);
      if(term == null)
        break Fail162;
      g_161 = term;
      term = v_36.invoke(context, e_161);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLtEq_2, new IStrategoTerm[]{g_161, term}), checkListAnnos(termFactory, f_161));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}