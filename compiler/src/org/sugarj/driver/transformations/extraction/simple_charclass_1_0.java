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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_charclass_1_0");
    Fail189:
    { 
      IStrategoTerm z_132 = null;
      IStrategoTerm w_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssimple_charclass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      w_132 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      z_132 = annos158;
      term = a_26.invoke(context, w_132);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssimple_charclass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}