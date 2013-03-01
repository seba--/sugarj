package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Amb$Name_2_0 extends Strategy 
{ 
  public static $Amb$Name_2_0 instance = new $Amb$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_39, Strategy y_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_2_0");
    Fail211:
    { 
      IStrategoTerm l_172 = null;
      IStrategoTerm f_172 = null;
      IStrategoTerm k_172 = null;
      IStrategoTerm m_172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAmbName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail211;
      f_172 = term.getSubterm(0);
      k_172 = term.getSubterm(1);
      IStrategoList annos180 = term.getAnnotations();
      l_172 = annos180;
      term = x_39.invoke(context, f_172);
      if(term == null)
        break Fail211;
      m_172 = term;
      term = y_39.invoke(context, k_172);
      if(term == null)
        break Fail211;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAmbName_2, new IStrategoTerm[]{m_172, term}), checkListAnnos(termFactory, l_172));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}