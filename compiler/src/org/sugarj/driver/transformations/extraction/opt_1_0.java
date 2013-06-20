package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class opt_1_0 extends Strategy 
{ 
  public static opt_1_0 instance = new opt_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("opt_1_0");
    Fail238:
    { 
      IStrategoTerm m_143 = null;
      IStrategoTerm l_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consopt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail238;
      l_143 = term.getSubterm(0);
      IStrategoList annos196 = term.getAnnotations();
      m_143 = annos196;
      term = f_28.invoke(context, l_143);
      if(term == null)
        break Fail238;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consopt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}