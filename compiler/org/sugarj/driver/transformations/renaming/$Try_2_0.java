package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_2_0 extends Strategy 
{ 
  public static $Try_2_0 instance = new $Try_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_25, Strategy f_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_2_0");
    Fail124:
    { 
      IStrategoTerm c_126 = null;
      IStrategoTerm a_126 = null;
      IStrategoTerm b_126 = null;
      IStrategoTerm d_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      a_126 = term.getSubterm(0);
      b_126 = term.getSubterm(1);
      IStrategoList annos102 = term.getAnnotations();
      c_126 = annos102;
      term = e_25.invoke(context, a_126);
      if(term == null)
        break Fail124;
      d_126 = term;
      term = f_25.invoke(context, b_126);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_2, new IStrategoTerm[]{d_126, term}), checkListAnnos(termFactory, c_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}