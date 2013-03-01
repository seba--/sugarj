package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Method_3_0 extends Strategy 
{ 
  public static $Q$Super$Method_3_0 instance = new $Q$Super$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_28, Strategy v_28, Strategy w_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperMethod_3_0");
    Fail61:
    { 
      IStrategoTerm c_131 = null;
      IStrategoTerm y_130 = null;
      IStrategoTerm z_130 = null;
      IStrategoTerm a_131 = null;
      IStrategoTerm e_131 = null;
      IStrategoTerm g_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consQSuperMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      y_130 = term.getSubterm(0);
      z_130 = term.getSubterm(1);
      a_131 = term.getSubterm(2);
      IStrategoList annos37 = term.getAnnotations();
      c_131 = annos37;
      term = u_28.invoke(context, y_130);
      if(term == null)
        break Fail61;
      e_131 = term;
      term = v_28.invoke(context, z_130);
      if(term == null)
        break Fail61;
      g_131 = term;
      term = w_28.invoke(context, a_131);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consQSuperMethod_3, new IStrategoTerm[]{e_131, g_131, term}), checkListAnnos(termFactory, c_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}