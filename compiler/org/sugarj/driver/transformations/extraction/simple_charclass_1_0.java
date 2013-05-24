package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class simple_charclass_1_0 extends Strategy 
{ 
  public static simple_charclass_1_0 instance = new simple_charclass_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_charclass_1_0");
    Fail1018:
    { 
      IStrategoTerm v_464 = null;
      IStrategoTerm u_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conssimple_charclass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1018;
      u_464 = term.getSubterm(0);
      IStrategoList annos250 = term.getAnnotations();
      v_464 = annos250;
      term = n_349.invoke(context, u_464);
      if(term == null)
        break Fail1018;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conssimple_charclass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}