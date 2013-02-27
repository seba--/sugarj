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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail146:
    { 
      IStrategoTerm v_114 = null;
      IStrategoTerm t_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      t_114 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      v_114 = annos132;
      term = p_18.invoke(context, t_114);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}