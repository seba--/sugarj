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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_22, Strategy s_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail128:
    { 
      IStrategoTerm w_121 = null;
      IStrategoTerm t_121 = null;
      IStrategoTerm u_121 = null;
      IStrategoTerm x_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      t_121 = term.getSubterm(0);
      u_121 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      w_121 = annos100;
      term = r_22.invoke(context, t_121);
      if(term == null)
        break Fail128;
      x_121 = term;
      term = s_22.invoke(context, u_121);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSeq_2, new IStrategoTerm[]{x_121, term}), checkListAnnos(termFactory, w_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}