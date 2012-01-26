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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecStm_1_0");
    Fail66:
    { 
      IStrategoTerm m_111 = null;
      IStrategoTerm l_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      l_111 = term.getSubterm(0);
      IStrategoList annos55 = term.getAnnotations();
      m_111 = annos55;
      term = u_18.invoke(context, l_111);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}