package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Rule_1_0 extends Strategy 
{ 
  public static $S$Rule_1_0 instance = new $S$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail72:
    { 
      IStrategoTerm i_103 = null;
      IStrategoTerm h_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      h_103 = term.getSubterm(0);
      IStrategoList annos63 = term.getAnnotations();
      i_103 = annos63;
      term = v_14.invoke(context, h_103);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}