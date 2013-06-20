package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parameterized_2_0 extends Strategy 
{ 
  public static parameterized_2_0 instance = new parameterized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_26, Strategy z_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_2_0");
    Fail215:
    { 
      IStrategoTerm w_137 = null;
      IStrategoTerm u_137 = null;
      IStrategoTerm v_137 = null;
      IStrategoTerm x_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consparameterized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail215;
      u_137 = term.getSubterm(0);
      v_137 = term.getSubterm(1);
      IStrategoList annos175 = term.getAnnotations();
      w_137 = annos175;
      term = y_26.invoke(context, u_137);
      if(term == null)
        break Fail215;
      x_137 = term;
      term = z_26.invoke(context, v_137);
      if(term == null)
        break Fail215;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consparameterized_2, new IStrategoTerm[]{x_137, term}), checkListAnnos(termFactory, w_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}