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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_1_0");
    Fail174:
    { 
      IStrategoTerm a_133 = null;
      IStrategoTerm x_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      x_132 = term.getSubterm(0);
      IStrategoList annos155 = term.getAnnotations();
      a_133 = annos155;
      term = g_26.invoke(context, x_132);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}