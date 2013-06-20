package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def$T_4_0 extends Strategy 
{ 
  public static $R$Def$T_4_0 instance = new $R$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_17, Strategy v_17, Strategy w_17, Strategy x_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail58:
    { 
      IStrategoTerm e_108 = null;
      IStrategoTerm a_108 = null;
      IStrategoTerm b_108 = null;
      IStrategoTerm c_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm f_108 = null;
      IStrategoTerm g_108 = null;
      IStrategoTerm h_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      a_108 = term.getSubterm(0);
      b_108 = term.getSubterm(1);
      c_108 = term.getSubterm(2);
      d_108 = term.getSubterm(3);
      IStrategoList annos31 = term.getAnnotations();
      e_108 = annos31;
      term = u_17.invoke(context, a_108);
      if(term == null)
        break Fail58;
      f_108 = term;
      term = v_17.invoke(context, b_108);
      if(term == null)
        break Fail58;
      g_108 = term;
      term = w_17.invoke(context, c_108);
      if(term == null)
        break Fail58;
      h_108 = term;
      term = x_17.invoke(context, d_108);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRDefT_4, new IStrategoTerm[]{f_108, g_108, h_108, term}), checkListAnnos(termFactory, e_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}