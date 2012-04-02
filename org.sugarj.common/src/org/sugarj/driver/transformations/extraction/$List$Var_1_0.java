package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Var_1_0 extends Strategy 
{ 
  public static $List$Var_1_0 instance = new $List$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListVar_1_0");
    Fail53:
    { 
      IStrategoTerm i_109 = null;
      IStrategoTerm h_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consListVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      h_109 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      i_109 = annos29;
      term = k_18.invoke(context, h_109);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consListVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}