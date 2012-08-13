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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_21, Strategy r_21, Strategy s_21, Strategy t_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDecHead_4_0");
    Fail87:
    { 
      IStrategoTerm r_116 = null;
      IStrategoTerm n_116 = null;
      IStrategoTerm o_116 = null;
      IStrategoTerm p_116 = null;
      IStrategoTerm q_116 = null;
      IStrategoTerm s_116 = null;
      IStrategoTerm t_116 = null;
      IStrategoTerm u_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDecHead_4 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      n_116 = term.getSubterm(0);
      o_116 = term.getSubterm(1);
      p_116 = term.getSubterm(2);
      q_116 = term.getSubterm(3);
      IStrategoList annos68 = term.getAnnotations();
      r_116 = annos68;
      term = q_21.invoke(context, n_116);
      if(term == null)
        break Fail87;
      s_116 = term;
      term = r_21.invoke(context, o_116);
      if(term == null)
        break Fail87;
      t_116 = term;
      term = s_21.invoke(context, p_116);
      if(term == null)
        break Fail87;
      u_116 = term;
      term = t_21.invoke(context, q_116);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{s_116, t_116, u_116, term}), checkListAnnos(termFactory, r_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}