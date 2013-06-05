package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScopeId_1_0");
    Fail39:
    { 
      IStrategoTerm i_104 = null;
      IStrategoTerm h_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleScopeId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      h_104 = term.getSubterm(0);
      IStrategoList annos12 = term.getAnnotations();
      i_104 = annos12;
      term = l_16.invoke(context, h_104);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleScopeId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}