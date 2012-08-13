package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_28, Strategy r_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail174:
    { 
      IStrategoTerm c_139 = null;
      IStrategoTerm a_139 = null;
      IStrategoTerm b_139 = null;
      IStrategoTerm d_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      a_139 = term.getSubterm(0);
      b_139 = term.getSubterm(1);
      IStrategoList annos149 = term.getAnnotations();
      c_139 = annos149;
      term = q_28.invoke(context, a_139);
      if(term == null)
        break Fail174;
      d_139 = term;
      term = r_28.invoke(context, b_139);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLt_2, new IStrategoTerm[]{d_139, term}), checkListAnnos(termFactory, c_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}