package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_46, Strategy p_46, Strategy q_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail335:
    { 
      IStrategoTerm l_191 = null;
      IStrategoTerm h_191 = null;
      IStrategoTerm i_191 = null;
      IStrategoTerm j_191 = null;
      IStrategoTerm m_191 = null;
      IStrategoTerm n_191 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail335;
      h_191 = term.getSubterm(0);
      i_191 = term.getSubterm(1);
      j_191 = term.getSubterm(2);
      IStrategoList annos281 = term.getAnnotations();
      l_191 = annos281;
      term = o_46.invoke(context, h_191);
      if(term == null)
        break Fail335;
      m_191 = term;
      term = p_46.invoke(context, i_191);
      if(term == null)
        break Fail335;
      n_191 = term;
      term = q_46.invoke(context, j_191);
      if(term == null)
        break Fail335;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimT_3, new IStrategoTerm[]{m_191, n_191, term}), checkListAnnos(termFactory, l_191));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}