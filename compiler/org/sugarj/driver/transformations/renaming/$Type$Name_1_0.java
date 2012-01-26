package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Name_1_0 extends Strategy 
{ 
  public static $Type$Name_1_0 instance = new $Type$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeName_1_0");
    Fail169:
    { 
      IStrategoTerm g_131 = null;
      IStrategoTerm e_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      e_131 = term.getSubterm(0);
      IStrategoList annos153 = term.getAnnotations();
      g_131 = annos153;
      term = o_25.invoke(context, e_131);
      if(term == null)
        break Fail169;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}