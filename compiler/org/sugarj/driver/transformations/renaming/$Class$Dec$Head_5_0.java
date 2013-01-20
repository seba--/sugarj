package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec$Head_5_0 extends Strategy 
{ 
  public static $Class$Dec$Head_5_0 instance = new $Class$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_29, Strategy q_29, Strategy r_29, Strategy s_29, Strategy t_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecHead_5_0");
    Fail73:
    { 
      IStrategoTerm f_136 = null;
      IStrategoTerm r_135 = null;
      IStrategoTerm u_135 = null;
      IStrategoTerm y_135 = null;
      IStrategoTerm b_136 = null;
      IStrategoTerm d_136 = null;
      IStrategoTerm h_136 = null;
      IStrategoTerm j_136 = null;
      IStrategoTerm k_136 = null;
      IStrategoTerm l_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClassDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      r_135 = term.getSubterm(0);
      u_135 = term.getSubterm(1);
      y_135 = term.getSubterm(2);
      b_136 = term.getSubterm(3);
      d_136 = term.getSubterm(4);
      IStrategoList annos49 = term.getAnnotations();
      f_136 = annos49;
      term = p_29.invoke(context, r_135);
      if(term == null)
        break Fail73;
      h_136 = term;
      term = q_29.invoke(context, u_135);
      if(term == null)
        break Fail73;
      j_136 = term;
      term = r_29.invoke(context, y_135);
      if(term == null)
        break Fail73;
      k_136 = term;
      term = s_29.invoke(context, b_136);
      if(term == null)
        break Fail73;
      l_136 = term;
      term = t_29.invoke(context, d_136);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClassDecHead_5, new IStrategoTerm[]{h_136, j_136, k_136, l_136, term}), checkListAnnos(termFactory, f_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}