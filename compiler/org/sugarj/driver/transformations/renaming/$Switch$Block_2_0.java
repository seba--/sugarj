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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_18, Strategy a_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchBlock_2_0");
    Fail71:
    { 
      IStrategoTerm d_112 = null;
      IStrategoTerm b_112 = null;
      IStrategoTerm c_112 = null;
      IStrategoTerm f_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchBlock_2 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      b_112 = term.getSubterm(0);
      c_112 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      d_112 = annos59;
      term = z_18.invoke(context, b_112);
      if(term == null)
        break Fail71;
      f_112 = term;
      term = a_19.invoke(context, c_112);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchBlock_2, new IStrategoTerm[]{f_112, term}), checkListAnnos(termFactory, d_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}