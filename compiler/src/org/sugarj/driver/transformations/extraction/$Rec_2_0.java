package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rec_2_0 extends Strategy 
{ 
  public static $Rec_2_0 instance = new $Rec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_22, Strategy c_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail119:
    { 
      IStrategoTerm t_119 = null;
      IStrategoTerm q_119 = null;
      IStrategoTerm r_119 = null;
      IStrategoTerm u_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      q_119 = term.getSubterm(0);
      r_119 = term.getSubterm(1);
      IStrategoList annos91 = term.getAnnotations();
      t_119 = annos91;
      term = b_22.invoke(context, q_119);
      if(term == null)
        break Fail119;
      u_119 = term;
      term = c_22.invoke(context, r_119);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRec_2, new IStrategoTerm[]{u_119, term}), checkListAnnos(termFactory, t_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}