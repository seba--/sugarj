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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_11, Strategy e_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddScopeLabel_2_0");
    Fail25:
    { 
      IStrategoTerm g_93 = null;
      IStrategoTerm d_93 = null;
      IStrategoTerm e_93 = null;
      IStrategoTerm h_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddScopeLabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      d_93 = term.getSubterm(0);
      e_93 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      g_93 = annos16;
      term = d_11.invoke(context, d_93);
      if(term == null)
        break Fail25;
      h_93 = term;
      term = e_11.invoke(context, e_93);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddScopeLabel_2, new IStrategoTerm[]{h_93, term}), checkListAnnos(termFactory, g_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}