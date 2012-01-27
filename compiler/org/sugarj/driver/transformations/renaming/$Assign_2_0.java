package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_21, Strategy v_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail112:
    { 
      IStrategoTerm o_119 = null;
      IStrategoTerm m_119 = null;
      IStrategoTerm n_119 = null;
      IStrategoTerm p_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      m_119 = term.getSubterm(0);
      n_119 = term.getSubterm(1);
      IStrategoList annos97 = term.getAnnotations();
      o_119 = annos97;
      term = u_21.invoke(context, m_119);
      if(term == null)
        break Fail112;
      p_119 = term;
      term = v_21.invoke(context, n_119);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssign_2, new IStrategoTerm[]{p_119, term}), checkListAnnos(termFactory, o_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}