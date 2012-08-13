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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassBody_1_0");
    Fail84:
    { 
      IStrategoTerm d_116 = null;
      IStrategoTerm c_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      c_116 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      d_116 = annos65;
      term = m_21.invoke(context, c_116);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}