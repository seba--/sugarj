package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Case_2_0 extends Strategy 
{ 
  public static $Switch$Case_2_0 instance = new $Switch$Case_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_18, Strategy i_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail51:
    { 
      IStrategoTerm b_109 = null;
      IStrategoTerm z_108 = null;
      IStrategoTerm a_109 = null;
      IStrategoTerm c_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      z_108 = term.getSubterm(0);
      a_109 = term.getSubterm(1);
      IStrategoList annos27 = term.getAnnotations();
      b_109 = annos27;
      term = h_18.invoke(context, z_108);
      if(term == null)
        break Fail51;
      c_109 = term;
      term = i_18.invoke(context, a_109);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSwitchCase_2, new IStrategoTerm[]{c_109, term}), checkListAnnos(termFactory, b_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}