package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Undefine$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Undefine$Dyn$Rule_2_0 instance = new $Undefine$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_17, Strategy i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail38:
    { 
      IStrategoTerm j_106 = null;
      IStrategoTerm h_106 = null;
      IStrategoTerm i_106 = null;
      IStrategoTerm k_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      h_106 = term.getSubterm(0);
      i_106 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      j_106 = annos15;
      term = h_17.invoke(context, h_106);
      if(term == null)
        break Fail38;
      k_106 = term;
      term = i_17.invoke(context, i_106);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consUndefineDynRule_2, new IStrategoTerm[]{k_106, term}), checkListAnnos(termFactory, j_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}