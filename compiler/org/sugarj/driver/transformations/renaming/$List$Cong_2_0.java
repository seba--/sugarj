package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong_2_0 extends Strategy 
{ 
  public static $List$Cong_2_0 instance = new $List$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_45, Strategy k_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail312:
    { 
      IStrategoTerm b_188 = null;
      IStrategoTerm z_187 = null;
      IStrategoTerm a_188 = null;
      IStrategoTerm c_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail312;
      z_187 = term.getSubterm(0);
      a_188 = term.getSubterm(1);
      IStrategoList annos259 = term.getAnnotations();
      b_188 = annos259;
      term = j_45.invoke(context, z_187);
      if(term == null)
        break Fail312;
      c_188 = term;
      term = k_45.invoke(context, a_188);
      if(term == null)
        break Fail312;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCong_2, new IStrategoTerm[]{c_188, term}), checkListAnnos(termFactory, b_188));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}