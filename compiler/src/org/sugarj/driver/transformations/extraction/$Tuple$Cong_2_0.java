package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple$Cong_2_0 extends Strategy 
{ 
  public static $Tuple$Cong_2_0 instance = new $Tuple$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_21, Strategy l_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail105:
    { 
      IStrategoTerm x_117 = null;
      IStrategoTerm v_117 = null;
      IStrategoTerm w_117 = null;
      IStrategoTerm y_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      v_117 = term.getSubterm(0);
      w_117 = term.getSubterm(1);
      IStrategoList annos78 = term.getAnnotations();
      x_117 = annos78;
      term = k_21.invoke(context, v_117);
      if(term == null)
        break Fail105;
      y_117 = term;
      term = l_21.invoke(context, w_117);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consTupleCong_2, new IStrategoTerm[]{y_117, term}), checkListAnnos(termFactory, x_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}