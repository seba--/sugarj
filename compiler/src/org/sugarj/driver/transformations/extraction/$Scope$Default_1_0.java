package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ScopeDefault_1_0");
    Fail122:
    { 
      IStrategoTerm p_120 = null;
      IStrategoTerm o_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consScopeDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      o_120 = term.getSubterm(0);
      IStrategoList annos94 = term.getAnnotations();
      p_120 = annos94;
      term = h_22.invoke(context, o_120);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consScopeDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}