package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Named$Escape_1_0 extends Strategy 
{ 
  public static $Named$Escape_1_0 instance = new $Named$Escape_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NamedEscape_1_0");
    Fail210:
    { 
      IStrategoTerm y_136 = null;
      IStrategoTerm v_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNamedEscape_1 != ((IStrategoAppl)term).getConstructor())
        break Fail210;
      v_136 = term.getSubterm(0);
      IStrategoList annos167 = term.getAnnotations();
      y_136 = annos167;
      term = a_27.invoke(context, v_136);
      if(term == null)
        break Fail210;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNamedEscape_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}