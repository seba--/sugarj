package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Id_1_0 extends Strategy 
{ 
  public static $Id_1_0 instance = new $Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Id_1_0");
    Fail204:
    { 
      IStrategoTerm z_134 = null;
      IStrategoTerm t_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      t_134 = term.getSubterm(0);
      IStrategoList annos166 = term.getAnnotations();
      z_134 = annos166;
      term = c_26.invoke(context, t_134);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}