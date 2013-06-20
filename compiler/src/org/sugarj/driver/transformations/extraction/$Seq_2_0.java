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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_22, Strategy u_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail129:
    { 
      IStrategoTerm b_122 = null;
      IStrategoTerm z_121 = null;
      IStrategoTerm a_122 = null;
      IStrategoTerm c_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      z_121 = term.getSubterm(0);
      a_122 = term.getSubterm(1);
      IStrategoList annos101 = term.getAnnotations();
      b_122 = annos101;
      term = t_22.invoke(context, z_121);
      if(term == null)
        break Fail129;
      c_122 = term;
      term = u_22.invoke(context, a_122);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSeq_2, new IStrategoTerm[]{c_122, term}), checkListAnnos(termFactory, b_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}