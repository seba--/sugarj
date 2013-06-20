package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Case_2_0 extends Strategy 
{ 
  public static $Switch$Case_2_0 instance = new $Switch$Case_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_18, Strategy j_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail63:
    { 
      IStrategoTerm j_109 = null;
      IStrategoTerm h_109 = null;
      IStrategoTerm i_109 = null;
      IStrategoTerm l_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      h_109 = term.getSubterm(0);
      i_109 = term.getSubterm(1);
      IStrategoList annos36 = term.getAnnotations();
      j_109 = annos36;
      term = i_18.invoke(context, h_109);
      if(term == null)
        break Fail63;
      l_109 = term;
      term = j_18.invoke(context, i_109);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSwitchCase_2, new IStrategoTerm[]{l_109, term}), checkListAnnos(termFactory, j_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}