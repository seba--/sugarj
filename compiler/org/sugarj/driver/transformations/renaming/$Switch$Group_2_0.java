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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_18, Strategy y_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchGroup_2_0");
    Fail70:
    { 
      IStrategoTerm y_111 = null;
      IStrategoTerm w_111 = null;
      IStrategoTerm x_111 = null;
      IStrategoTerm z_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchGroup_2 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      w_111 = term.getSubterm(0);
      x_111 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      y_111 = annos58;
      term = x_18.invoke(context, w_111);
      if(term == null)
        break Fail70;
      z_111 = term;
      term = y_18.invoke(context, x_111);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchGroup_2, new IStrategoTerm[]{z_111, term}), checkListAnnos(termFactory, y_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}