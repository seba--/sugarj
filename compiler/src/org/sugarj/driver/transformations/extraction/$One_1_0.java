package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $One_1_0 extends Strategy 
{ 
  public static $One_1_0 instance = new $One_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("One_1_0");
    Fail126:
    { 
      IStrategoTerm f_121 = null;
      IStrategoTerm e_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOne_1 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      e_121 = term.getSubterm(0);
      IStrategoList annos98 = term.getAnnotations();
      f_121 = annos98;
      term = m_22.invoke(context, e_121);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOne_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}