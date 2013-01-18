package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_41, Strategy r_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail263:
    { 
      IStrategoTerm v_177 = null;
      IStrategoTerm t_177 = null;
      IStrategoTerm u_177 = null;
      IStrategoTerm w_177 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail263;
      t_177 = term.getSubterm(0);
      u_177 = term.getSubterm(1);
      IStrategoList annos210 = term.getAnnotations();
      v_177 = annos210;
      term = q_41.invoke(context, t_177);
      if(term == null)
        break Fail263;
      w_177 = term;
      term = r_41.invoke(context, u_177);
      if(term == null)
        break Fail263;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddScopeLabel_2, new IStrategoTerm[]{w_177, term}), checkListAnnos(termFactory, v_177));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}