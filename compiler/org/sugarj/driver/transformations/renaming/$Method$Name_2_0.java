package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Name_2_0 extends Strategy 
{ 
  public static $Method$Name_2_0 instance = new $Method$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_31, Strategy h_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodName_2_0");
    Fail215:
    { 
      IStrategoTerm n_149 = null;
      IStrategoTerm l_149 = null;
      IStrategoTerm m_149 = null;
      IStrategoTerm o_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail215;
      l_149 = term.getSubterm(0);
      m_149 = term.getSubterm(1);
      IStrategoList annos189 = term.getAnnotations();
      n_149 = annos189;
      term = g_31.invoke(context, l_149);
      if(term == null)
        break Fail215;
      o_149 = term;
      term = h_31.invoke(context, m_149);
      if(term == null)
        break Fail215;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodName_2, new IStrategoTerm[]{o_149, term}), checkListAnnos(termFactory, n_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}