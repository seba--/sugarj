package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Elem$Val$Pair_2_0 extends Strategy 
{ 
  public static $Elem$Val$Pair_2_0 instance = new $Elem$Val$Pair_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_28, Strategy n_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ElemValPair_2_0");
    Fail57:
    { 
      IStrategoTerm x_129 = null;
      IStrategoTerm v_129 = null;
      IStrategoTerm w_129 = null;
      IStrategoTerm z_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consElemValPair_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      v_129 = term.getSubterm(0);
      w_129 = term.getSubterm(1);
      IStrategoList annos33 = term.getAnnotations();
      x_129 = annos33;
      term = m_28.invoke(context, v_129);
      if(term == null)
        break Fail57;
      z_129 = term;
      term = n_28.invoke(context, w_129);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consElemValPair_2, new IStrategoTerm[]{z_129, term}), checkListAnnos(termFactory, x_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}