package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_343, Strategy x_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail914:
    { 
      IStrategoTerm b_450 = null;
      IStrategoTerm z_449 = null;
      IStrategoTerm a_450 = null;
      IStrategoTerm c_450 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail914;
      z_449 = term.getSubterm(0);
      a_450 = term.getSubterm(1);
      IStrategoList annos159 = term.getAnnotations();
      b_450 = annos159;
      term = w_343.invoke(context, z_449);
      if(term == null)
        break Fail914;
      c_450 = term;
      term = x_343.invoke(context, a_450);
      if(term == null)
        break Fail914;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExplodeCong_2, new IStrategoTerm[]{c_450, term}), checkListAnnos(termFactory, b_450));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}