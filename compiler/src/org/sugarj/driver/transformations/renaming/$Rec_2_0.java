package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rec_2_0 extends Strategy 
{ 
  public static $Rec_2_0 instance = new $Rec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_15, Strategy v_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail92:
    { 
      IStrategoTerm f_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm e_106 = null;
      IStrategoTerm g_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      d_106 = term.getSubterm(0);
      e_106 = term.getSubterm(1);
      IStrategoList annos82 = term.getAnnotations();
      f_106 = annos82;
      term = u_15.invoke(context, d_106);
      if(term == null)
        break Fail92;
      g_106 = term;
      term = v_15.invoke(context, e_106);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRec_2, new IStrategoTerm[]{g_106, term}), checkListAnnos(termFactory, f_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}