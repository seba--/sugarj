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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_21, Strategy e_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayVarDecId_2_0");
    Fail97:
    { 
      IStrategoTerm b_117 = null;
      IStrategoTerm z_116 = null;
      IStrategoTerm a_117 = null;
      IStrategoTerm c_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayVarDecId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      z_116 = term.getSubterm(0);
      a_117 = term.getSubterm(1);
      IStrategoList annos80 = term.getAnnotations();
      b_117 = annos80;
      term = d_21.invoke(context, z_116);
      if(term == null)
        break Fail97;
      c_117 = term;
      term = e_21.invoke(context, a_117);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayVarDecId_2, new IStrategoTerm[]{c_117, term}), checkListAnnos(termFactory, b_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}