package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $All_1_0 extends Strategy 
{ 
  public static $All_1_0 instance = new $All_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail95:
    { 
      IStrategoTerm a_107 = null;
      IStrategoTerm z_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      z_106 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      a_107 = annos88;
      term = z_15.invoke(context, z_106);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}