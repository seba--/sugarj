package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$As_1_0 extends Strategy 
{ 
  public static $Import$As_1_0 instance = new $Import$As_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportAs_1_0");
    Fail49:
    { 
      IStrategoTerm o_128 = null;
      IStrategoTerm n_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImportAs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      n_128 = term.getSubterm(0);
      IStrategoList annos26 = term.getAnnotations();
      o_128 = annos26;
      term = d_28.invoke(context, n_128);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImportAs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}