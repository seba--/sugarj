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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_11, Strategy b_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail26:
    { 
      IStrategoTerm c_93 = null;
      IStrategoTerm y_92 = null;
      IStrategoTerm b_93 = null;
      IStrategoTerm d_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      y_92 = term.getSubterm(0);
      b_93 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      c_93 = annos16;
      term = a_11.invoke(context, y_92);
      if(term == null)
        break Fail26;
      d_93 = term;
      term = b_11.invoke(context, b_93);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddScopeLabel_2, new IStrategoTerm[]{d_93, term}), checkListAnnos(termFactory, c_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}