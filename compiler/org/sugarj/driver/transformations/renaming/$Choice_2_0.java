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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_14, Strategy u_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail71:
    { 
      IStrategoTerm e_103 = null;
      IStrategoTerm c_103 = null;
      IStrategoTerm d_103 = null;
      IStrategoTerm f_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      c_103 = term.getSubterm(0);
      d_103 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      e_103 = annos62;
      term = t_14.invoke(context, c_103);
      if(term == null)
        break Fail71;
      f_103 = term;
      term = u_14.invoke(context, d_103);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChoice_2, new IStrategoTerm[]{f_103, term}), checkListAnnos(termFactory, e_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}