package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode$Cong_2_0 extends Strategy 
{ 
  public static $Explode$Cong_2_0 instance = new $Explode$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_21, Strategy f_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail90:
    { 
      IStrategoTerm c_117 = null;
      IStrategoTerm a_117 = null;
      IStrategoTerm b_117 = null;
      IStrategoTerm d_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      a_117 = term.getSubterm(0);
      b_117 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      c_117 = annos66;
      term = e_21.invoke(context, a_117);
      if(term == null)
        break Fail90;
      d_117 = term;
      term = f_21.invoke(context, b_117);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExplodeCong_2, new IStrategoTerm[]{d_117, term}), checkListAnnos(termFactory, c_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}