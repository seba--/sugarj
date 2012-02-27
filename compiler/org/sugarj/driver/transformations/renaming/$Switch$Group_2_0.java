package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Group_2_0 extends Strategy 
{ 
  public static $Switch$Group_2_0 instance = new $Switch$Group_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_19, Strategy v_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchGroup_2_0");
    Fail75:
    { 
      IStrategoTerm x_112 = null;
      IStrategoTerm v_112 = null;
      IStrategoTerm w_112 = null;
      IStrategoTerm y_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchGroup_2 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      v_112 = term.getSubterm(0);
      w_112 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      x_112 = annos58;
      term = u_19.invoke(context, v_112);
      if(term == null)
        break Fail75;
      y_112 = term;
      term = v_19.invoke(context, w_112);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchGroup_2, new IStrategoTerm[]{y_112, term}), checkListAnnos(termFactory, x_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}