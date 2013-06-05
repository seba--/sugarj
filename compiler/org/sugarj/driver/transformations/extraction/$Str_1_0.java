package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str_1_0 extends Strategy 
{ 
  public static $Str_1_0 instance = new $Str_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Str_1_0");
    Fail169:
    { 
      IStrategoTerm m_128 = null;
      IStrategoTerm l_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consStr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      l_128 = term.getSubterm(0);
      IStrategoList annos138 = term.getAnnotations();
      m_128 = annos138;
      term = y_24.invoke(context, l_128);
      if(term == null)
        break Fail169;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consStr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}