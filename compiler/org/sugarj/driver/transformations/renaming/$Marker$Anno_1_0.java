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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MarkerAnno_1_0");
    Fail58:
    { 
      IStrategoTerm d_130 = null;
      IStrategoTerm c_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMarkerAnno_1 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      c_130 = term.getSubterm(0);
      IStrategoList annos34 = term.getAnnotations();
      d_130 = annos34;
      term = o_28.invoke(context, c_130);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMarkerAnno_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}