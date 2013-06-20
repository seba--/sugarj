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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_22, Strategy o_22, Strategy p_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail127:
    { 
      IStrategoTerm m_121 = null;
      IStrategoTerm h_121 = null;
      IStrategoTerm i_121 = null;
      IStrategoTerm j_121 = null;
      IStrategoTerm n_121 = null;
      IStrategoTerm o_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      h_121 = term.getSubterm(0);
      i_121 = term.getSubterm(1);
      j_121 = term.getSubterm(2);
      IStrategoList annos99 = term.getAnnotations();
      m_121 = annos99;
      term = n_22.invoke(context, h_121);
      if(term == null)
        break Fail127;
      n_121 = term;
      term = o_22.invoke(context, i_121);
      if(term == null)
        break Fail127;
      o_121 = term;
      term = p_22.invoke(context, j_121);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consPrimT_3, new IStrategoTerm[]{n_121, o_121, term}), checkListAnnos(termFactory, m_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}