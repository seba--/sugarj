package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class_1_0 extends Strategy 
{ 
  public static $Class_1_0 instance = new $Class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Class_1_0");
    Fail103:
    { 
      IStrategoTerm x_117 = null;
      IStrategoTerm w_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      w_117 = term.getSubterm(0);
      IStrategoList annos85 = term.getAnnotations();
      x_117 = annos85;
      term = m_21.invoke(context, w_117);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}