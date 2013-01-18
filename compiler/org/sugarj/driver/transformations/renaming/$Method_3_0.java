package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_3_0 extends Strategy 
{ 
  public static $Method_3_0 instance = new $Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_28, Strategy a_29, Strategy b_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_3_0");
    Fail63:
    { 
      IStrategoTerm z_131 = null;
      IStrategoTerm v_131 = null;
      IStrategoTerm x_131 = null;
      IStrategoTerm y_131 = null;
      IStrategoTerm b_132 = null;
      IStrategoTerm c_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      v_131 = term.getSubterm(0);
      x_131 = term.getSubterm(1);
      y_131 = term.getSubterm(2);
      IStrategoList annos39 = term.getAnnotations();
      z_131 = annos39;
      term = z_28.invoke(context, v_131);
      if(term == null)
        break Fail63;
      b_132 = term;
      term = a_29.invoke(context, x_131);
      if(term == null)
        break Fail63;
      c_132 = term;
      term = b_29.invoke(context, y_131);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMethod_3, new IStrategoTerm[]{b_132, c_132, term}), checkListAnnos(termFactory, z_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}