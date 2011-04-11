package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List_1_0 extends Strategy 
{ 
  public static $List_1_0 instance = new $List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("List_1_0");
    Fail151:
    { 
      IStrategoTerm i_127 = null;
      IStrategoTerm h_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      h_127 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      i_127 = annos123;
      term = p_24.invoke(context, h_127);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}