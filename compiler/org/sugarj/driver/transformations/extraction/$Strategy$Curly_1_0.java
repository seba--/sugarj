package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Strategy$Curly_1_0 extends Strategy 
{ 
  public static $Strategy$Curly_1_0 instance = new $Strategy$Curly_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail63:
    { 
      IStrategoTerm i_109 = null;
      IStrategoTerm h_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      h_109 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      i_109 = annos36;
      term = i_18.invoke(context, h_109);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}