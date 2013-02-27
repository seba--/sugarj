package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeLabels_1_0");
    Fail27:
    { 
      IStrategoTerm d_93 = null;
      IStrategoTerm c_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScopeLabels_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      c_93 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      d_93 = annos17;
      term = z_10.invoke(context, c_93);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScopeLabels_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}