package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class func_2_0 extends Strategy 
{ 
  public static func_2_0 instance = new func_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_27, Strategy v_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("func_2_0");
    Fail220:
    { 
      IStrategoTerm e_141 = null;
      IStrategoTerm c_141 = null;
      IStrategoTerm d_141 = null;
      IStrategoTerm i_141 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consfunc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail220;
      c_141 = term.getSubterm(0);
      d_141 = term.getSubterm(1);
      IStrategoList annos181 = term.getAnnotations();
      e_141 = annos181;
      term = u_27.invoke(context, c_141);
      if(term == null)
        break Fail220;
      i_141 = term;
      term = v_27.invoke(context, d_141);
      if(term == null)
        break Fail220;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consfunc_2, new IStrategoTerm[]{i_141, term}), checkListAnnos(termFactory, e_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}