package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_41, Strategy l_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail260:
    { 
      IStrategoTerm z_176 = null;
      IStrategoTerm v_176 = null;
      IStrategoTerm y_176 = null;
      IStrategoTerm h_177 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail260;
      v_176 = term.getSubterm(0);
      y_176 = term.getSubterm(1);
      IStrategoList annos207 = term.getAnnotations();
      z_176 = annos207;
      term = k_41.invoke(context, v_176);
      if(term == null)
        break Fail260;
      h_177 = term;
      term = l_41.invoke(context, y_176);
      if(term == null)
        break Fail260;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddDynRule_2, new IStrategoTerm[]{h_177, term}), checkListAnnos(termFactory, z_176));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}