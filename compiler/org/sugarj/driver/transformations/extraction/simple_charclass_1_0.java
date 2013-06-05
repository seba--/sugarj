package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class simple_charclass_1_0 extends Strategy 
{ 
  public static simple_charclass_1_0 instance = new simple_charclass_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_charclass_1_0");
    Fail188:
    { 
      IStrategoTerm m_132 = null;
      IStrategoTerm j_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conssimple_charclass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      j_132 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      m_132 = annos157;
      term = y_25.invoke(context, j_132);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conssimple_charclass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}