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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail64:
    { 
      IStrategoTerm o_109 = null;
      IStrategoTerm n_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      n_109 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      o_109 = annos37;
      term = k_18.invoke(context, n_109);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}