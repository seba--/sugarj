package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cong$Q_2_0 extends Strategy 
{ 
  public static $Cong$Q_2_0 instance = new $Cong$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_45, Strategy r_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail317:
    { 
      IStrategoTerm t_188 = null;
      IStrategoTerm r_188 = null;
      IStrategoTerm s_188 = null;
      IStrategoTerm u_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail317;
      r_188 = term.getSubterm(0);
      s_188 = term.getSubterm(1);
      IStrategoList annos263 = term.getAnnotations();
      t_188 = annos263;
      term = q_45.invoke(context, r_188);
      if(term == null)
        break Fail317;
      u_188 = term;
      term = r_45.invoke(context, s_188);
      if(term == null)
        break Fail317;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCongQ_2, new IStrategoTerm[]{u_188, term}), checkListAnnos(termFactory, t_188));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}