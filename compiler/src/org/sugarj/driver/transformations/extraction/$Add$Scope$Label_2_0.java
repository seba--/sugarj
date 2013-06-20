package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add$Scope$Label_2_0 extends Strategy 
{ 
  public static $Add$Scope$Label_2_0 instance = new $Add$Scope$Label_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17, Strategy l_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail52:
    { 
      IStrategoTerm x_106 = null;
      IStrategoTerm u_106 = null;
      IStrategoTerm v_106 = null;
      IStrategoTerm y_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      u_106 = term.getSubterm(0);
      v_106 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      x_106 = annos25;
      term = k_17.invoke(context, u_106);
      if(term == null)
        break Fail52;
      y_106 = term;
      term = l_17.invoke(context, v_106);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAddScopeLabel_2, new IStrategoTerm[]{y_106, term}), checkListAnnos(termFactory, x_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}