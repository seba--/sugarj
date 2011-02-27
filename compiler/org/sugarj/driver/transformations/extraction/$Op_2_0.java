package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op_2_0 extends Strategy 
{ 
  public static $Op_2_0 instance = new $Op_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_24, Strategy y_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail156:
    { 
      IStrategoTerm f_128 = null;
      IStrategoTerm d_128 = null;
      IStrategoTerm e_128 = null;
      IStrategoTerm g_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      d_128 = term.getSubterm(0);
      e_128 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      f_128 = annos129;
      term = x_24.invoke(context, d_128);
      if(term == null)
        break Fail156;
      g_128 = term;
      term = y_24.invoke(context, e_128);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOp_2, new IStrategoTerm[]{g_128, term}), checkListAnnos(termFactory, f_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}