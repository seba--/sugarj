package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope$Labels_1_0 extends Strategy 
{ 
  public static $Scope$Labels_1_0 instance = new $Scope$Labels_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail23:
    { 
      IStrategoTerm e_93 = null;
      IStrategoTerm d_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      d_93 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      e_93 = annos17;
      term = a_11.invoke(context, d_93);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}