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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_10, Strategy y_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail26:
    { 
      IStrategoTerm x_92 = null;
      IStrategoTerm u_92 = null;
      IStrategoTerm v_92 = null;
      IStrategoTerm y_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      u_92 = term.getSubterm(0);
      v_92 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      x_92 = annos16;
      term = x_10.invoke(context, u_92);
      if(term == null)
        break Fail26;
      y_92 = term;
      term = y_10.invoke(context, v_92);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddScopeLabel_2, new IStrategoTerm[]{y_92, term}), checkListAnnos(termFactory, x_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}