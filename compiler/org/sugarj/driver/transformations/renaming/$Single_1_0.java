package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single_1_0 extends Strategy 
{ 
  public static $Single_1_0 instance = new $Single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Single_1_0");
    Fail184:
    { 
      IStrategoTerm m_132 = null;
      IStrategoTerm j_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail184;
      j_132 = term.getSubterm(0);
      IStrategoList annos159 = term.getAnnotations();
      m_132 = annos159;
      term = v_25.invoke(context, j_132);
      if(term == null)
        break Fail184;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}