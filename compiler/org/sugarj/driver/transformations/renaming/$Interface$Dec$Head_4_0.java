package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec$Head_4_0 extends Strategy 
{ 
  public static $Interface$Dec$Head_4_0 instance = new $Interface$Dec$Head_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_15, Strategy r_15, Strategy s_15, Strategy t_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDecHead_4_0");
    Fail36:
    { 
      IStrategoTerm l_103 = null;
      IStrategoTerm h_103 = null;
      IStrategoTerm i_103 = null;
      IStrategoTerm j_103 = null;
      IStrategoTerm k_103 = null;
      IStrategoTerm m_103 = null;
      IStrategoTerm n_103 = null;
      IStrategoTerm o_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDecHead_4 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      h_103 = term.getSubterm(0);
      i_103 = term.getSubterm(1);
      j_103 = term.getSubterm(2);
      k_103 = term.getSubterm(3);
      IStrategoList annos27 = term.getAnnotations();
      l_103 = annos27;
      term = q_15.invoke(context, h_103);
      if(term == null)
        break Fail36;
      m_103 = term;
      term = r_15.invoke(context, i_103);
      if(term == null)
        break Fail36;
      n_103 = term;
      term = s_15.invoke(context, j_103);
      if(term == null)
        break Fail36;
      o_103 = term;
      term = t_15.invoke(context, k_103);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{m_103, n_103, o_103, term}), checkListAnnos(termFactory, l_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}