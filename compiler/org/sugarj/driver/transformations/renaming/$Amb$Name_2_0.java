package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Amb$Name_2_0 extends Strategy 
{ 
  public static $Amb$Name_2_0 instance = new $Amb$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_25, Strategy q_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_2_0");
    Fail170:
    { 
      IStrategoTerm n_131 = null;
      IStrategoTerm j_131 = null;
      IStrategoTerm l_131 = null;
      IStrategoTerm s_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      j_131 = term.getSubterm(0);
      l_131 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      n_131 = annos154;
      term = p_25.invoke(context, j_131);
      if(term == null)
        break Fail170;
      s_131 = term;
      term = q_25.invoke(context, l_131);
      if(term == null)
        break Fail170;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_2, new IStrategoTerm[]{s_131, term}), checkListAnnos(termFactory, n_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}