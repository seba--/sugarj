package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Dec_2_0 extends Strategy 
{ 
  public static $Method$Dec_2_0 instance = new $Method$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_33, Strategy b_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDec_2_0");
    Fail106:
    { 
      IStrategoTerm g_148 = null;
      IStrategoTerm e_148 = null;
      IStrategoTerm f_148 = null;
      IStrategoTerm h_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail106;
      e_148 = term.getSubterm(0);
      f_148 = term.getSubterm(1);
      IStrategoList annos80 = term.getAnnotations();
      g_148 = annos80;
      term = a_33.invoke(context, e_148);
      if(term == null)
        break Fail106;
      h_148 = term;
      term = b_33.invoke(context, f_148);
      if(term == null)
        break Fail106;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMethodDec_2, new IStrategoTerm[]{h_148, term}), checkListAnnos(termFactory, g_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}