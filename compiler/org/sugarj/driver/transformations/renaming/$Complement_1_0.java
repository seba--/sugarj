package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Complement_1_0 extends Strategy 
{ 
  public static $Complement_1_0 instance = new $Complement_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Complement_1_0");
    Fail141:
    { 
      IStrategoTerm c_126 = null;
      IStrategoTerm b_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consComplement_1 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      b_126 = term.getSubterm(0);
      IStrategoList annos121 = term.getAnnotations();
      c_126 = annos121;
      term = m_24.invoke(context, b_126);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consComplement_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}