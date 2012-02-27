package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single$Elem$Anno_2_0 extends Strategy 
{ 
  public static $Single$Elem$Anno_2_0 instance = new $Single$Elem$Anno_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_15, Strategy f_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SingleElemAnno_2_0");
    Fail23:
    { 
      IStrategoTerm v_100 = null;
      IStrategoTerm t_100 = null;
      IStrategoTerm u_100 = null;
      IStrategoTerm w_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSingleElemAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      t_100 = term.getSubterm(0);
      u_100 = term.getSubterm(1);
      IStrategoList annos9 = term.getAnnotations();
      v_100 = annos9;
      term = e_15.invoke(context, t_100);
      if(term == null)
        break Fail23;
      w_100 = term;
      term = f_15.invoke(context, u_100);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSingleElemAnno_2, new IStrategoTerm[]{w_100, term}), checkListAnnos(termFactory, v_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}