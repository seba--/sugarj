package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Marker$Anno_1_0 extends Strategy 
{ 
  public static $Marker$Anno_1_0 instance = new $Marker$Anno_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MarkerAnno_1_0");
    Fail17:
    { 
      IStrategoTerm t_99 = null;
      IStrategoTerm s_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMarkerAnno_1 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      s_99 = term.getSubterm(0);
      IStrategoList annos8 = term.getAnnotations();
      t_99 = annos8;
      term = g_14.invoke(context, s_99);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMarkerAnno_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}