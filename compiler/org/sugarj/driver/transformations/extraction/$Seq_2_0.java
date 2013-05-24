package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Seq_2_0 extends Strategy 
{ 
  public static $Seq_2_0 instance = new $Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_341, Strategy x_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail882:
    { 
      IStrategoTerm w_444 = null;
      IStrategoTerm u_444 = null;
      IStrategoTerm v_444 = null;
      IStrategoTerm x_444 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail882;
      u_444 = term.getSubterm(0);
      v_444 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      w_444 = annos128;
      term = w_341.invoke(context, u_444);
      if(term == null)
        break Fail882;
      x_444 = term;
      term = x_341.invoke(context, v_444);
      if(term == null)
        break Fail882;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSeq_2, new IStrategoTerm[]{x_444, term}), checkListAnnos(termFactory, w_444));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}