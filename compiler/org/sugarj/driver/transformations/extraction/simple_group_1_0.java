package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class simple_group_1_0 extends Strategy 
{ 
  public static simple_group_1_0 instance = new simple_group_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_group_1_0");
    Fail1032:
    { 
      IStrategoTerm e_466 = null;
      IStrategoTerm d_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conssimple_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1032;
      d_466 = term.getSubterm(0);
      IStrategoList annos259 = term.getAnnotations();
      e_466 = annos259;
      term = a_350.invoke(context, d_466);
      if(term == null)
        break Fail1032;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conssimple_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}