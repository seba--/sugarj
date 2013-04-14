package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_17, Strategy c_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail112:
    { 
      IStrategoTerm u_109 = null;
      IStrategoTerm s_109 = null;
      IStrategoTerm t_109 = null;
      IStrategoTerm v_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      s_109 = term.getSubterm(0);
      t_109 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      u_109 = annos100;
      term = b_17.invoke(context, s_109);
      if(term == null)
        break Fail112;
      v_109 = term;
      term = c_17.invoke(context, t_109);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFunType_2, new IStrategoTerm[]{v_109, term}), checkListAnnos(termFactory, u_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}