package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fun_1_0 extends Strategy 
{ 
  public static fun_1_0 instance = new fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fun_1_0");
    Fail1071:
    { 
      IStrategoTerm t_471 = null;
      IStrategoTerm s_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consfun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1071;
      s_471 = term.getSubterm(0);
      IStrategoList annos296 = term.getAnnotations();
      t_471 = annos296;
      term = c_352.invoke(context, s_471);
      if(term == null)
        break Fail1071;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consfun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}