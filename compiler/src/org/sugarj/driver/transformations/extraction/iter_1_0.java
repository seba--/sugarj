package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_1_0 extends Strategy 
{ 
  public static iter_1_0 instance = new iter_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_1_0");
    Fail237:
    { 
      IStrategoTerm i_143 = null;
      IStrategoTerm h_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consiter_1 != ((IStrategoAppl)term).getConstructor())
        break Fail237;
      h_143 = term.getSubterm(0);
      IStrategoList annos195 = term.getAnnotations();
      i_143 = annos195;
      term = e_28.invoke(context, h_143);
      if(term == null)
        break Fail237;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consiter_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}