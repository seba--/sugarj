package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Field_1_0 extends Strategy 
{ 
  public static $Super$Field_1_0 instance = new $Super$Field_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperField_1_0");
    Fail28:
    { 
      IStrategoTerm b_102 = null;
      IStrategoTerm a_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperField_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      a_102 = term.getSubterm(0);
      IStrategoList annos16 = term.getAnnotations();
      b_102 = annos16;
      term = m_15.invoke(context, a_102);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperField_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}