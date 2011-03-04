package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_restrictions_1_0 extends Strategy 
{ 
  public static lexical_restrictions_1_0 instance = new lexical_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_restrictions_1_0");
    Fail243:
    { 
      IStrategoTerm g_145 = null;
      IStrategoTerm f_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslexical_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail243;
      f_145 = term.getSubterm(0);
      IStrategoList annos198 = term.getAnnotations();
      g_145 = annos198;
      term = u_28.invoke(context, f_145);
      if(term == null)
        break Fail243;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslexical_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}