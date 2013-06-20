package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Add$Dyn$Rule_2_0 instance = new $Add$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17, Strategy f_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail49:
    { 
      IStrategoTerm h_106 = null;
      IStrategoTerm f_106 = null;
      IStrategoTerm g_106 = null;
      IStrategoTerm i_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      f_106 = term.getSubterm(0);
      g_106 = term.getSubterm(1);
      IStrategoList annos22 = term.getAnnotations();
      h_106 = annos22;
      term = e_17.invoke(context, f_106);
      if(term == null)
        break Fail49;
      i_106 = term;
      term = f_17.invoke(context, g_106);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAddDynRule_2, new IStrategoTerm[]{i_106, term}), checkListAnnos(termFactory, h_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}