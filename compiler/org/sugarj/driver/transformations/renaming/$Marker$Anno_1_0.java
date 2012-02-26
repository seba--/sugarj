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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MarkerAnno_1_0");
    Fail20:
    { 
      IStrategoTerm j_100 = null;
      IStrategoTerm i_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMarkerAnno_1 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      i_100 = term.getSubterm(0);
      IStrategoList annos8 = term.getAnnotations();
      j_100 = annos8;
      term = v_14.invoke(context, i_100);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMarkerAnno_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}