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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_group_1_0");
    Fail204:
    { 
      IStrategoTerm t_136 = null;
      IStrategoTerm s_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssimple_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      s_136 = term.getSubterm(0);
      IStrategoList annos168 = term.getAnnotations();
      t_136 = annos168;
      term = p_26.invoke(context, s_136);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssimple_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}