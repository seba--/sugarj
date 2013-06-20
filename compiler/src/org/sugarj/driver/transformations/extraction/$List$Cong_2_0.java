package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_21, Strategy i_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail103:
    { 
      IStrategoTerm p_117 = null;
      IStrategoTerm n_117 = null;
      IStrategoTerm o_117 = null;
      IStrategoTerm q_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      n_117 = term.getSubterm(0);
      o_117 = term.getSubterm(1);
      IStrategoList annos76 = term.getAnnotations();
      p_117 = annos76;
      term = h_21.invoke(context, n_117);
      if(term == null)
        break Fail103;
      q_117 = term;
      term = i_21.invoke(context, o_117);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consListCong_2, new IStrategoTerm[]{q_117, term}), checkListAnnos(termFactory, p_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}