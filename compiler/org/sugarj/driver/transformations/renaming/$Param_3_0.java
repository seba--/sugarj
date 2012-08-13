package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Param_3_0 extends Strategy 
{ 
  public static $Param_3_0 instance = new $Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_24, Strategy d_24, Strategy e_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_3_0");
    Fail112:
    { 
      IStrategoTerm e_123 = null;
      IStrategoTerm b_123 = null;
      IStrategoTerm c_123 = null;
      IStrategoTerm d_123 = null;
      IStrategoTerm f_123 = null;
      IStrategoTerm g_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      b_123 = term.getSubterm(0);
      c_123 = term.getSubterm(1);
      d_123 = term.getSubterm(2);
      IStrategoList annos92 = term.getAnnotations();
      e_123 = annos92;
      term = c_24.invoke(context, b_123);
      if(term == null)
        break Fail112;
      f_123 = term;
      term = d_24.invoke(context, c_123);
      if(term == null)
        break Fail112;
      g_123 = term;
      term = e_24.invoke(context, d_123);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consParam_3, new IStrategoTerm[]{f_123, g_123, term}), checkListAnnos(termFactory, e_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}