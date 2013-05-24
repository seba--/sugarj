package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Builder$Caption_1_0 extends Strategy 
{ 
  public static $Builder$Caption_1_0 instance = new $Builder$Caption_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuilderCaption_1_0");
    Fail762:
    { 
      IStrategoTerm n_428 = null;
      IStrategoTerm m_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBuilderCaption_1 != ((IStrategoAppl)term).getConstructor())
        break Fail762;
      m_428 = term.getSubterm(0);
      IStrategoList annos34 = term.getAnnotations();
      n_428 = annos34;
      term = j_335.invoke(context, m_428);
      if(term == null)
        break Fail762;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBuilderCaption_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_428));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}