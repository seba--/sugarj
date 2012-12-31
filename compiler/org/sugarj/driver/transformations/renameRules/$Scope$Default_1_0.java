package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Scope$Default_1_0 extends Strategy 
{ 
  public static $Scope$Default_1_0 instance = new $Scope$Default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeDefault_1_0");
    Fail92:
    { 
      IStrategoTerm o_106 = null;
      IStrategoTerm n_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consScopeDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      n_106 = term.getSubterm(0);
      IStrategoList annos85 = term.getAnnotations();
      o_106 = annos85;
      term = v_15.invoke(context, n_106);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consScopeDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}