package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode$Cong_2_0 extends Strategy 
{ 
  public static $Explode$Cong_2_0 instance = new $Explode$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_45, Strategy i_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail311:
    { 
      IStrategoTerm w_187 = null;
      IStrategoTerm u_187 = null;
      IStrategoTerm v_187 = null;
      IStrategoTerm x_187 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail311;
      u_187 = term.getSubterm(0);
      v_187 = term.getSubterm(1);
      IStrategoList annos258 = term.getAnnotations();
      w_187 = annos258;
      term = h_45.invoke(context, u_187);
      if(term == null)
        break Fail311;
      x_187 = term;
      term = i_45.invoke(context, v_187);
      if(term == null)
        break Fail311;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplodeCong_2, new IStrategoTerm[]{x_187, term}), checkListAnnos(termFactory, w_187));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}