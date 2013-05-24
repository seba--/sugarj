package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fence$Defs_1_0 extends Strategy 
{ 
  public static $Fence$Defs_1_0 instance = new $Fence$Defs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FenceDefs_1_0");
    Fail835:
    { 
      IStrategoTerm q_436 = null;
      IStrategoTerm p_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consFenceDefs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail835;
      p_436 = term.getSubterm(0);
      IStrategoList annos83 = term.getAnnotations();
      q_436 = annos83;
      term = p_338.invoke(context, p_436);
      if(term == null)
        break Fail835;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consFenceDefs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}