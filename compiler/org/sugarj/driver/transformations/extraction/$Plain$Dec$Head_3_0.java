package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plain$Dec$Head_3_0 extends Strategy 
{ 
  public static $Plain$Dec$Head_3_0 instance = new $Plain$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_352, Strategy r_352, Strategy s_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PlainDecHead_3_0");
    Fail1083:
    { 
      IStrategoTerm g_473 = null;
      IStrategoTerm d_473 = null;
      IStrategoTerm e_473 = null;
      IStrategoTerm f_473 = null;
      IStrategoTerm h_473 = null;
      IStrategoTerm i_473 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPlainDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1083;
      d_473 = term.getSubterm(0);
      e_473 = term.getSubterm(1);
      f_473 = term.getSubterm(2);
      IStrategoList annos305 = term.getAnnotations();
      g_473 = annos305;
      term = q_352.invoke(context, d_473);
      if(term == null)
        break Fail1083;
      h_473 = term;
      term = r_352.invoke(context, e_473);
      if(term == null)
        break Fail1083;
      i_473 = term;
      term = s_352.invoke(context, f_473);
      if(term == null)
        break Fail1083;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPlainDecHead_3, new IStrategoTerm[]{h_473, i_473, term}), checkListAnnos(termFactory, g_473));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}