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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_21, Strategy r_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignDiv_2_0");
    Fail110:
    { 
      IStrategoTerm e_119 = null;
      IStrategoTerm c_119 = null;
      IStrategoTerm d_119 = null;
      IStrategoTerm f_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      c_119 = term.getSubterm(0);
      d_119 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      e_119 = annos95;
      term = q_21.invoke(context, c_119);
      if(term == null)
        break Fail110;
      f_119 = term;
      term = r_21.invoke(context, d_119);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignDiv_2, new IStrategoTerm[]{f_119, term}), checkListAnnos(termFactory, e_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}