package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Overlay$No$Args_2_0 extends Strategy 
{ 
  public static $Overlay$No$Args_2_0 instance = new $Overlay$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_18, Strategy g_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail49:
    { 
      IStrategoTerm w_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm v_108 = null;
      IStrategoTerm x_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      u_108 = term.getSubterm(0);
      v_108 = term.getSubterm(1);
      IStrategoList annos26 = term.getAnnotations();
      w_108 = annos26;
      term = f_18.invoke(context, u_108);
      if(term == null)
        break Fail49;
      x_108 = term;
      term = g_18.invoke(context, v_108);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOverlayNoArgs_2, new IStrategoTerm[]{x_108, term}), checkListAnnos(termFactory, w_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}