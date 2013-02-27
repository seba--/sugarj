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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_18, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail141:
    { 
      IStrategoTerm b_114 = null;
      IStrategoTerm z_113 = null;
      IStrategoTerm a_114 = null;
      IStrategoTerm c_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      z_113 = term.getSubterm(0);
      a_114 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      b_114 = annos127;
      term = k_18.invoke(context, z_113);
      if(term == null)
        break Fail141;
      c_114 = term;
      term = l_18.invoke(context, a_114);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplode_2, new IStrategoTerm[]{c_114, term}), checkListAnnos(termFactory, b_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}