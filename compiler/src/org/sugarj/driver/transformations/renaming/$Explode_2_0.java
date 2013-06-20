package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode_2_0 extends Strategy 
{ 
  public static $Explode_2_0 instance = new $Explode_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_18, Strategy o_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail140:
    { 
      IStrategoTerm e_114 = null;
      IStrategoTerm c_114 = null;
      IStrategoTerm d_114 = null;
      IStrategoTerm f_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      c_114 = term.getSubterm(0);
      d_114 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      e_114 = annos127;
      term = n_18.invoke(context, c_114);
      if(term == null)
        break Fail140;
      f_114 = term;
      term = o_18.invoke(context, d_114);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplode_2, new IStrategoTerm[]{f_114, term}), checkListAnnos(termFactory, e_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}