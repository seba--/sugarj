package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_14, Strategy r_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail72:
    { 
      IStrategoTerm b_103 = null;
      IStrategoTerm z_102 = null;
      IStrategoTerm a_103 = null;
      IStrategoTerm c_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      z_102 = term.getSubterm(0);
      a_103 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      b_103 = annos62;
      term = q_14.invoke(context, z_102);
      if(term == null)
        break Fail72;
      c_103 = term;
      term = r_14.invoke(context, a_103);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChoice_2, new IStrategoTerm[]{c_103, term}), checkListAnnos(termFactory, b_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}