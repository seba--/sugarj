package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Named$Escape_1_0 extends Strategy 
{ 
  public static $Named$Escape_1_0 instance = new $Named$Escape_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NamedEscape_1_0");
    Fail208:
    { 
      IStrategoTerm n_136 = null;
      IStrategoTerm m_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNamedEscape_1 != ((IStrategoAppl)term).getConstructor())
        break Fail208;
      m_136 = term.getSubterm(0);
      IStrategoList annos167 = term.getAnnotations();
      n_136 = annos167;
      term = s_26.invoke(context, m_136);
      if(term == null)
        break Fail208;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNamedEscape_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}