package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$R$G$B_3_0 extends Strategy 
{ 
  public static $Color$R$G$B_3_0 instance = new $Color$R$G$B_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_337, Strategy e_337, Strategy f_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRGB_3_0");
    Fail807:
    { 
      IStrategoTerm a_433 = null;
      IStrategoTerm x_432 = null;
      IStrategoTerm y_432 = null;
      IStrategoTerm z_432 = null;
      IStrategoTerm b_433 = null;
      IStrategoTerm c_433 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorRGB_3 != ((IStrategoAppl)term).getConstructor())
        break Fail807;
      x_432 = term.getSubterm(0);
      y_432 = term.getSubterm(1);
      z_432 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      a_433 = annos57;
      term = d_337.invoke(context, x_432);
      if(term == null)
        break Fail807;
      b_433 = term;
      term = e_337.invoke(context, y_432);
      if(term == null)
        break Fail807;
      c_433 = term;
      term = f_337.invoke(context, z_432);
      if(term == null)
        break Fail807;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consColorRGB_3, new IStrategoTerm[]{b_433, c_433, term}), checkListAnnos(termFactory, a_433));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}