package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Minus_2_0 extends Strategy 
{ 
  public static $Assign$Minus_2_0 instance = new $Assign$Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_21, Strategy a_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMinus_2_0");
    Fail110:
    { 
      IStrategoTerm f_119 = null;
      IStrategoTerm d_119 = null;
      IStrategoTerm e_119 = null;
      IStrategoTerm g_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      d_119 = term.getSubterm(0);
      e_119 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      f_119 = annos92;
      term = z_21.invoke(context, d_119);
      if(term == null)
        break Fail110;
      g_119 = term;
      term = a_22.invoke(context, e_119);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMinus_2, new IStrategoTerm[]{g_119, term}), checkListAnnos(termFactory, f_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}