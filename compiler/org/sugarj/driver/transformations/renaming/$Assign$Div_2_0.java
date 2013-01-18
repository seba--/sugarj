package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Div_2_0 extends Strategy 
{ 
  public static $Assign$Div_2_0 instance = new $Assign$Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_35, Strategy z_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignDiv_2_0");
    Fail151:
    { 
      IStrategoTerm w_158 = null;
      IStrategoTerm u_158 = null;
      IStrategoTerm v_158 = null;
      IStrategoTerm x_158 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      u_158 = term.getSubterm(0);
      v_158 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      w_158 = annos121;
      term = y_35.invoke(context, u_158);
      if(term == null)
        break Fail151;
      x_158 = term;
      term = z_35.invoke(context, v_158);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignDiv_2, new IStrategoTerm[]{x_158, term}), checkListAnnos(termFactory, w_158));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}