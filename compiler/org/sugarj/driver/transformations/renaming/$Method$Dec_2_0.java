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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_18, Strategy t_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDec_2_0");
    Fail65:
    { 
      IStrategoTerm i_111 = null;
      IStrategoTerm g_111 = null;
      IStrategoTerm h_111 = null;
      IStrategoTerm j_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      g_111 = term.getSubterm(0);
      h_111 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      i_111 = annos54;
      term = s_18.invoke(context, g_111);
      if(term == null)
        break Fail65;
      j_111 = term;
      term = t_18.invoke(context, h_111);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDec_2, new IStrategoTerm[]{j_111, term}), checkListAnnos(termFactory, i_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}