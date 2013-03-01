package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Import$As$Dec_2_0 extends Strategy 
{ 
  public static $Type$Import$As$Dec_2_0 instance = new $Type$Import$As$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_28, Strategy c_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportAsDec_2_0");
    Fail48:
    { 
      IStrategoTerm k_128 = null;
      IStrategoTerm i_128 = null;
      IStrategoTerm j_128 = null;
      IStrategoTerm l_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeImportAsDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      i_128 = term.getSubterm(0);
      j_128 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      k_128 = annos25;
      term = b_28.invoke(context, i_128);
      if(term == null)
        break Fail48;
      l_128 = term;
      term = c_28.invoke(context, j_128);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeImportAsDec_2, new IStrategoTerm[]{l_128, term}), checkListAnnos(termFactory, k_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}