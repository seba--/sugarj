package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_15, Strategy s_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail90:
    { 
      IStrategoTerm f_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm e_106 = null;
      IStrategoTerm g_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      d_106 = term.getSubterm(0);
      e_106 = term.getSubterm(1);
      IStrategoList annos83 = term.getAnnotations();
      f_106 = annos83;
      term = r_15.invoke(context, d_106);
      if(term == null)
        break Fail90;
      g_106 = term;
      term = s_15.invoke(context, e_106);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLChoice_2, new IStrategoTerm[]{g_106, term}), checkListAnnos(termFactory, f_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}