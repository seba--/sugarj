package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_10, Strategy z_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail22:
    { 
      IStrategoTerm y_92 = null;
      IStrategoTerm v_92 = null;
      IStrategoTerm x_92 = null;
      IStrategoTerm b_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      v_92 = term.getSubterm(0);
      x_92 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      y_92 = annos16;
      term = y_10.invoke(context, v_92);
      if(term == null)
        break Fail22;
      b_93 = term;
      term = z_10.invoke(context, x_92);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddScopeLabel_2, new IStrategoTerm[]{b_93, term}), checkListAnnos(termFactory, y_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}