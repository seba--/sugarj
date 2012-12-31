package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail143:
    { 
      IStrategoTerm z_114 = null;
      IStrategoTerm y_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      y_114 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      z_114 = annos133;
      term = r_18.invoke(context, y_114);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}