package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_22, Strategy q_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail118:
    { 
      IStrategoTerm e_121 = null;
      IStrategoTerm c_121 = null;
      IStrategoTerm d_121 = null;
      IStrategoTerm f_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      c_121 = term.getSubterm(0);
      d_121 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      e_121 = annos100;
      term = p_22.invoke(context, c_121);
      if(term == null)
        break Fail118;
      f_121 = term;
      term = q_22.invoke(context, d_121);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnd_2, new IStrategoTerm[]{f_121, term}), checkListAnnos(termFactory, e_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}