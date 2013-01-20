package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Param_3_0 extends Strategy 
{ 
  public static $Param_3_0 instance = new $Param_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_32, Strategy l_32, Strategy m_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_3_0");
    Fail102:
    { 
      IStrategoTerm h_146 = null;
      IStrategoTerm e_146 = null;
      IStrategoTerm f_146 = null;
      IStrategoTerm g_146 = null;
      IStrategoTerm i_146 = null;
      IStrategoTerm j_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consParam_3 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      e_146 = term.getSubterm(0);
      f_146 = term.getSubterm(1);
      g_146 = term.getSubterm(2);
      IStrategoList annos77 = term.getAnnotations();
      h_146 = annos77;
      term = k_32.invoke(context, e_146);
      if(term == null)
        break Fail102;
      i_146 = term;
      term = l_32.invoke(context, f_146);
      if(term == null)
        break Fail102;
      j_146 = term;
      term = m_32.invoke(context, g_146);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consParam_3, new IStrategoTerm[]{i_146, j_146, term}), checkListAnnos(termFactory, h_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}