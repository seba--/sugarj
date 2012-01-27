package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Amb$Name_1_0 extends Strategy 
{ 
  public static $Amb$Name_1_0 instance = new $Amb$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_1_0");
    Fail171:
    { 
      IStrategoTerm x_131 = null;
      IStrategoTerm v_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      v_131 = term.getSubterm(0);
      IStrategoList annos155 = term.getAnnotations();
      x_131 = annos155;
      term = r_25.invoke(context, v_131);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}