package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Var$Dec$Id_2_0 extends Strategy 
{ 
  public static $Array$Var$Dec$Id_2_0 instance = new $Array$Var$Dec$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_26, Strategy p_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayVarDecId_2_0");
    Fail145:
    { 
      IStrategoTerm d_130 = null;
      IStrategoTerm a_130 = null;
      IStrategoTerm c_130 = null;
      IStrategoTerm f_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayVarDecId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      a_130 = term.getSubterm(0);
      c_130 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      d_130 = annos121;
      term = o_26.invoke(context, a_130);
      if(term == null)
        break Fail145;
      f_130 = term;
      term = p_26.invoke(context, c_130);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayVarDecId_2, new IStrategoTerm[]{f_130, term}), checkListAnnos(termFactory, d_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}