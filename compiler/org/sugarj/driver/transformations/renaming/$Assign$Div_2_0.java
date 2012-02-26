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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_22, Strategy g_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignDiv_2_0");
    Fail113:
    { 
      IStrategoTerm w_119 = null;
      IStrategoTerm t_119 = null;
      IStrategoTerm u_119 = null;
      IStrategoTerm x_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      t_119 = term.getSubterm(0);
      u_119 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      w_119 = annos95;
      term = f_22.invoke(context, t_119);
      if(term == null)
        break Fail113;
      x_119 = term;
      term = g_22.invoke(context, u_119);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignDiv_2, new IStrategoTerm[]{x_119, term}), checkListAnnos(termFactory, w_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}