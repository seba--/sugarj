package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_16, Strategy z_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail110:
    { 
      IStrategoTerm j_109 = null;
      IStrategoTerm h_109 = null;
      IStrategoTerm i_109 = null;
      IStrategoTerm l_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      h_109 = term.getSubterm(0);
      i_109 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      j_109 = annos98;
      term = y_16.invoke(context, h_109);
      if(term == null)
        break Fail110;
      l_109 = term;
      term = z_16.invoke(context, i_109);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLet_2, new IStrategoTerm[]{l_109, term}), checkListAnnos(termFactory, j_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}