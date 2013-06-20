package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Undefine$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Undefine$Dyn$Rule_2_0 instance = new $Undefine$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_11, Strategy c_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail24:
    { 
      IStrategoTerm y_92 = null;
      IStrategoTerm v_92 = null;
      IStrategoTerm x_92 = null;
      IStrategoTerm b_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      v_92 = term.getSubterm(0);
      x_92 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      y_92 = annos15;
      term = b_11.invoke(context, v_92);
      if(term == null)
        break Fail24;
      b_93 = term;
      term = c_11.invoke(context, x_92);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consUndefineDynRule_2, new IStrategoTerm[]{b_93, term}), checkListAnnos(termFactory, y_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}