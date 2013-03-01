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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_1_0");
    Fail212:
    { 
      IStrategoTerm p_172 = null;
      IStrategoTerm o_172 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAmbName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail212;
      o_172 = term.getSubterm(0);
      IStrategoList annos181 = term.getAnnotations();
      p_172 = annos181;
      term = z_39.invoke(context, o_172);
      if(term == null)
        break Fail212;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAmbName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_172));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}