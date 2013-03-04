package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Cong_2_0 extends Strategy 
{ 
  public static $Anno$Cong_2_0 instance = new $Anno$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_45, Strategy p_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail316:
    { 
      IStrategoTerm o_188 = null;
      IStrategoTerm m_188 = null;
      IStrategoTerm n_188 = null;
      IStrategoTerm p_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail316;
      m_188 = term.getSubterm(0);
      n_188 = term.getSubterm(1);
      IStrategoList annos262 = term.getAnnotations();
      o_188 = annos262;
      term = o_45.invoke(context, m_188);
      if(term == null)
        break Fail316;
      p_188 = term;
      term = p_45.invoke(context, n_188);
      if(term == null)
        break Fail316;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoCong_2, new IStrategoTerm[]{p_188, term}), checkListAnnos(termFactory, o_188));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}