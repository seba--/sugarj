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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeName_1_0");
    Fail220:
    { 
      IStrategoTerm h_150 = null;
      IStrategoTerm g_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail220;
      g_150 = term.getSubterm(0);
      IStrategoList annos194 = term.getAnnotations();
      h_150 = annos194;
      term = o_31.invoke(context, g_150);
      if(term == null)
        break Fail220;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}