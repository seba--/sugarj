package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope$Id_1_0 instance = new $Dyn$Rule$Scope$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScopeId_1_0");
    Fail251:
    { 
      IStrategoTerm f_175 = null;
      IStrategoTerm e_175 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScopeId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail251;
      e_175 = term.getSubterm(0);
      IStrategoList annos198 = term.getAnnotations();
      f_175 = annos198;
      term = t_40.invoke(context, e_175);
      if(term == null)
        break Fail251;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScopeId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_175));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}