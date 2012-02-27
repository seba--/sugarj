package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec$Stm_1_0 extends Strategy 
{ 
  public static $Class$Dec$Stm_1_0 instance = new $Class$Dec$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecStm_1_0");
    Fail71:
    { 
      IStrategoTerm n_112 = null;
      IStrategoTerm m_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      m_112 = term.getSubterm(0);
      IStrategoList annos55 = term.getAnnotations();
      n_112 = annos55;
      term = r_19.invoke(context, m_112);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}