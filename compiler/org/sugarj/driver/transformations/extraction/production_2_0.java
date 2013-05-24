package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class production_2_0 extends Strategy 
{ 
  public static production_2_0 instance = new production_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_350, Strategy a_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("production_2_0");
    Fail1048:
    { 
      IStrategoTerm t_468 = null;
      IStrategoTerm r_468 = null;
      IStrategoTerm s_468 = null;
      IStrategoTerm u_468 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consproduction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1048;
      r_468 = term.getSubterm(0);
      s_468 = term.getSubterm(1);
      IStrategoList annos275 = term.getAnnotations();
      t_468 = annos275;
      term = z_350.invoke(context, r_468);
      if(term == null)
        break Fail1048;
      u_468 = term;
      term = a_351.invoke(context, s_468);
      if(term == null)
        break Fail1048;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consproduction_2, new IStrategoTerm[]{u_468, term}), checkListAnnos(termFactory, t_468));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}