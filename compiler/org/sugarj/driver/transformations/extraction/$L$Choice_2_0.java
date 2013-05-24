package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_342, Strategy y_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail895:
    { 
      IStrategoTerm l_447 = null;
      IStrategoTerm j_447 = null;
      IStrategoTerm k_447 = null;
      IStrategoTerm m_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail895;
      j_447 = term.getSubterm(0);
      k_447 = term.getSubterm(1);
      IStrategoList annos141 = term.getAnnotations();
      l_447 = annos141;
      term = x_342.invoke(context, j_447);
      if(term == null)
        break Fail895;
      m_447 = term;
      term = y_342.invoke(context, k_447);
      if(term == null)
        break Fail895;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLChoice_2, new IStrategoTerm[]{m_447, term}), checkListAnnos(termFactory, l_447));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}