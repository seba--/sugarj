package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lit_1_0 extends Strategy 
{ 
  public static $Lit_1_0 instance = new $Lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lit_1_0");
    Fail189:
    { 
      IStrategoTerm m_168 = null;
      IStrategoTerm l_168 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      l_168 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      m_168 = annos158;
      term = r_38.invoke(context, l_168);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_168));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}