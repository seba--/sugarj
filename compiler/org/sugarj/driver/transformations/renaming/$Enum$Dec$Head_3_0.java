package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec$Head_3_0 extends Strategy 
{ 
  public static $Enum$Dec$Head_3_0 instance = new $Enum$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_17, Strategy r_17, Strategy s_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDecHead_3_0");
    Fail51:
    { 
      IStrategoTerm t_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      IStrategoTerm s_107 = null;
      IStrategoTerm u_107 = null;
      IStrategoTerm v_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      q_107 = term.getSubterm(0);
      r_107 = term.getSubterm(1);
      s_107 = term.getSubterm(2);
      IStrategoList annos39 = term.getAnnotations();
      t_107 = annos39;
      term = q_17.invoke(context, q_107);
      if(term == null)
        break Fail51;
      u_107 = term;
      term = r_17.invoke(context, r_107);
      if(term == null)
        break Fail51;
      v_107 = term;
      term = s_17.invoke(context, s_107);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDecHead_3, new IStrategoTerm[]{u_107, v_107, term}), checkListAnnos(termFactory, t_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}