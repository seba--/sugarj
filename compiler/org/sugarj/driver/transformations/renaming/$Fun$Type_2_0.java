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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_16, Strategy z_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail113:
    { 
      IStrategoTerm r_109 = null;
      IStrategoTerm n_109 = null;
      IStrategoTerm o_109 = null;
      IStrategoTerm s_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      n_109 = term.getSubterm(0);
      o_109 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      r_109 = annos100;
      term = y_16.invoke(context, n_109);
      if(term == null)
        break Fail113;
      s_109 = term;
      term = z_16.invoke(context, o_109);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFunType_2, new IStrategoTerm[]{s_109, term}), checkListAnnos(termFactory, r_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}