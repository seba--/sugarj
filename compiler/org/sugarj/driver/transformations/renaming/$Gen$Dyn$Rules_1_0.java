package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gen$Dyn$Rules_1_0 extends Strategy 
{ 
  public static $Gen$Dyn$Rules_1_0 instance = new $Gen$Dyn$Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GenDynRules_1_0");
    Fail299:
    { 
      IStrategoTerm n_185 = null;
      IStrategoTerm m_185 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGenDynRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail299;
      m_185 = term.getSubterm(0);
      IStrategoList annos246 = term.getAnnotations();
      n_185 = annos246;
      term = l_44.invoke(context, m_185);
      if(term == null)
        break Fail299;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGenDynRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_185));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}