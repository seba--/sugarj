package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Body_1_0 extends Strategy 
{ 
  public static $Class$Body_1_0 instance = new $Class$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassBody_1_0");
    Fail33:
    { 
      IStrategoTerm x_102 = null;
      IStrategoTerm w_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      w_102 = term.getSubterm(0);
      IStrategoList annos24 = term.getAnnotations();
      x_102 = annos24;
      term = m_15.invoke(context, w_102);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}