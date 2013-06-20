package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class char_class_1_0 extends Strategy 
{ 
  public static char_class_1_0 instance = new char_class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("char_class_1_0");
    Fail180:
    { 
      IStrategoTerm v_130 = null;
      IStrategoTerm t_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conschar_class_1 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      t_130 = term.getSubterm(0);
      IStrategoList annos149 = term.getAnnotations();
      v_130 = annos149;
      term = o_25.invoke(context, t_130);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conschar_class_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}