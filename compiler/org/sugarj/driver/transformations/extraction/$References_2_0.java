package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $References_2_0 extends Strategy 
{ 
  public static $References_2_0 instance = new $References_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_336, Strategy b_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("References_2_0");
    Fail779:
    { 
      IStrategoTerm f_430 = null;
      IStrategoTerm d_430 = null;
      IStrategoTerm e_430 = null;
      IStrategoTerm g_430 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consReferences_2 != ((IStrategoAppl)term).getConstructor())
        break Fail779;
      d_430 = term.getSubterm(0);
      e_430 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      f_430 = annos43;
      term = a_336.invoke(context, d_430);
      if(term == null)
        break Fail779;
      g_430 = term;
      term = b_336.invoke(context, e_430);
      if(term == null)
        break Fail779;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consReferences_2, new IStrategoTerm[]{g_430, term}), checkListAnnos(termFactory, f_430));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}