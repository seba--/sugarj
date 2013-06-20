package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $With_1_0 extends Strategy 
{ 
  public static $With_1_0 instance = new $With_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("With_1_0");
    Fail116:
    { 
      IStrategoTerm i_119 = null;
      IStrategoTerm h_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consWith_1 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      h_119 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      i_119 = annos88;
      term = y_21.invoke(context, h_119);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consWith_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}