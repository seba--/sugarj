package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op_2_0 extends Strategy 
{ 
  public static $Op_2_0 instance = new $Op_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_24, Strategy z_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail169:
    { 
      IStrategoTerm n_128 = null;
      IStrategoTerm l_128 = null;
      IStrategoTerm m_128 = null;
      IStrategoTerm o_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      l_128 = term.getSubterm(0);
      m_128 = term.getSubterm(1);
      IStrategoList annos138 = term.getAnnotations();
      n_128 = annos138;
      term = y_24.invoke(context, l_128);
      if(term == null)
        break Fail169;
      o_128 = term;
      term = z_24.invoke(context, m_128);
      if(term == null)
        break Fail169;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOp_2, new IStrategoTerm[]{o_128, term}), checkListAnnos(termFactory, n_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}