package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec_2_0 extends Strategy 
{ 
  public static $Class$Dec_2_0 instance = new $Class$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_21, Strategy o_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDec_2_0");
    Fail85:
    { 
      IStrategoTerm h_116 = null;
      IStrategoTerm f_116 = null;
      IStrategoTerm g_116 = null;
      IStrategoTerm i_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      f_116 = term.getSubterm(0);
      g_116 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      h_116 = annos66;
      term = n_21.invoke(context, f_116);
      if(term == null)
        break Fail85;
      i_116 = term;
      term = o_21.invoke(context, g_116);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDec_2, new IStrategoTerm[]{i_116, term}), checkListAnnos(termFactory, h_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}