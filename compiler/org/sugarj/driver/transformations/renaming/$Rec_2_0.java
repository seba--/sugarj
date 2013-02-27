package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_15, Strategy s_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail93:
    { 
      IStrategoTerm c_106 = null;
      IStrategoTerm z_105 = null;
      IStrategoTerm b_106 = null;
      IStrategoTerm d_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      z_105 = term.getSubterm(0);
      b_106 = term.getSubterm(1);
      IStrategoList annos82 = term.getAnnotations();
      c_106 = annos82;
      term = r_15.invoke(context, z_105);
      if(term == null)
        break Fail93;
      d_106 = term;
      term = s_15.invoke(context, b_106);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRec_2, new IStrategoTerm[]{d_106, term}), checkListAnnos(termFactory, c_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}