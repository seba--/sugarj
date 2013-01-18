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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Id_1_0");
    Fail245:
    { 
      IStrategoTerm g_174 = null;
      IStrategoTerm f_174 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail245;
      f_174 = term.getSubterm(0);
      IStrategoList annos192 = term.getAnnotations();
      g_174 = annos192;
      term = k_40.invoke(context, f_174);
      if(term == null)
        break Fail245;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_174));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}