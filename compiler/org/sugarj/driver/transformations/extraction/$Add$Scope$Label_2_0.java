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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_339, Strategy w_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail857:
    { 
      IStrategoTerm v_439 = null;
      IStrategoTerm t_439 = null;
      IStrategoTerm u_439 = null;
      IStrategoTerm w_439 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail857;
      t_439 = term.getSubterm(0);
      u_439 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      v_439 = annos103;
      term = v_339.invoke(context, t_439);
      if(term == null)
        break Fail857;
      w_439 = term;
      term = w_339.invoke(context, u_439);
      if(term == null)
        break Fail857;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAddScopeLabel_2, new IStrategoTerm[]{w_439, term}), checkListAnnos(termFactory, v_439));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}