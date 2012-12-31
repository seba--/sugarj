package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_18, Strategy j_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail137:
    { 
      IStrategoTerm z_113 = null;
      IStrategoTerm x_113 = null;
      IStrategoTerm y_113 = null;
      IStrategoTerm a_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      x_113 = term.getSubterm(0);
      y_113 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      z_113 = annos127;
      term = i_18.invoke(context, x_113);
      if(term == null)
        break Fail137;
      a_114 = term;
      term = j_18.invoke(context, y_113);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExplode_2, new IStrategoTerm[]{a_114, term}), checkListAnnos(termFactory, z_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}