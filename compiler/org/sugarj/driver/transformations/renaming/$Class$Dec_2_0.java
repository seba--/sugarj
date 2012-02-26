package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec_2_0 extends Strategy 
{ 
  public static $Class$Dec_2_0 instance = new $Class$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_16, Strategy d_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDec_2_0");
    Fail37:
    { 
      IStrategoTerm r_103 = null;
      IStrategoTerm p_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm s_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      p_103 = term.getSubterm(0);
      q_103 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      r_103 = annos25;
      term = c_16.invoke(context, p_103);
      if(term == null)
        break Fail37;
      s_103 = term;
      term = d_16.invoke(context, q_103);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDec_2, new IStrategoTerm[]{s_103, term}), checkListAnnos(termFactory, r_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}