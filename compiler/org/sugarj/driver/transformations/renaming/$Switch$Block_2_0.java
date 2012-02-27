package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Block_2_0 extends Strategy 
{ 
  public static $Switch$Block_2_0 instance = new $Switch$Block_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_19, Strategy x_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchBlock_2_0");
    Fail76:
    { 
      IStrategoTerm c_113 = null;
      IStrategoTerm a_113 = null;
      IStrategoTerm b_113 = null;
      IStrategoTerm d_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchBlock_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      a_113 = term.getSubterm(0);
      b_113 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      c_113 = annos59;
      term = w_19.invoke(context, a_113);
      if(term == null)
        break Fail76;
      d_113 = term;
      term = x_19.invoke(context, b_113);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchBlock_2, new IStrategoTerm[]{d_113, term}), checkListAnnos(termFactory, c_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}