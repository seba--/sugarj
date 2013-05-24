package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Locked_1_0 extends Strategy 
{ 
  public static $Locked_1_0 instance = new $Locked_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Locked_1_0");
    Fail727:
    { 
      IStrategoTerm r_423 = null;
      IStrategoTerm q_423 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLocked_1 != ((IStrategoAppl)term).getConstructor())
        break Fail727;
      q_423 = term.getSubterm(0);
      IStrategoList annos0 = term.getAnnotations();
      r_423 = annos0;
      term = p_333.invoke(context, q_423);
      if(term == null)
        break Fail727;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLocked_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_423));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}