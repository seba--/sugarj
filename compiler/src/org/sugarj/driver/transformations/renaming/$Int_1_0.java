package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail145:
    { 
      IStrategoTerm d_115 = null;
      IStrategoTerm a_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      a_115 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      d_115 = annos132;
      term = v_18.invoke(context, a_115);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}