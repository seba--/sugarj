package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$T_3_0 extends Strategy 
{ 
  public static $Prim$T_3_0 instance = new $Prim$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_347, Strategy v_347, Strategy w_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail979:
    { 
      IStrategoTerm g_460 = null;
      IStrategoTerm d_460 = null;
      IStrategoTerm e_460 = null;
      IStrategoTerm f_460 = null;
      IStrategoTerm h_460 = null;
      IStrategoTerm i_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail979;
      d_460 = term.getSubterm(0);
      e_460 = term.getSubterm(1);
      f_460 = term.getSubterm(2);
      IStrategoList annos219 = term.getAnnotations();
      g_460 = annos219;
      term = u_347.invoke(context, d_460);
      if(term == null)
        break Fail979;
      h_460 = term;
      term = v_347.invoke(context, e_460);
      if(term == null)
        break Fail979;
      i_460 = term;
      term = w_347.invoke(context, f_460);
      if(term == null)
        break Fail979;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPrimT_3, new IStrategoTerm[]{h_460, i_460, term}), checkListAnnos(termFactory, g_460));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}