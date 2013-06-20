package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_14, Strategy s_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail70:
    { 
      IStrategoTerm z_102 = null;
      IStrategoTerm x_102 = null;
      IStrategoTerm y_102 = null;
      IStrategoTerm a_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      x_102 = term.getSubterm(0);
      y_102 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      z_102 = annos61;
      term = r_14.invoke(context, x_102);
      if(term == null)
        break Fail70;
      a_103 = term;
      term = s_14.invoke(context, y_102);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRChoice_2, new IStrategoTerm[]{a_103, term}), checkListAnnos(termFactory, z_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}