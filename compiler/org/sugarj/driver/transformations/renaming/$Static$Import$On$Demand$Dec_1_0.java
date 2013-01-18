package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Import$On$Demand$Dec_1_0 extends Strategy 
{ 
  public static $Static$Import$On$Demand$Dec_1_0 instance = new $Static$Import$On$Demand$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportOnDemandDec_1_0");
    Fail51:
    { 
      IStrategoTerm t_128 = null;
      IStrategoTerm s_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStaticImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      s_128 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      t_128 = annos27;
      term = e_28.invoke(context, s_128);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStaticImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}