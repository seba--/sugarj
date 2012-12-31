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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_31, Strategy k_31, Strategy l_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDecHead_3_0");
    Fail89:
    { 
      IStrategoTerm t_142 = null;
      IStrategoTerm q_142 = null;
      IStrategoTerm r_142 = null;
      IStrategoTerm s_142 = null;
      IStrategoTerm u_142 = null;
      IStrategoTerm v_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEnumDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      q_142 = term.getSubterm(0);
      r_142 = term.getSubterm(1);
      s_142 = term.getSubterm(2);
      IStrategoList annos65 = term.getAnnotations();
      t_142 = annos65;
      term = j_31.invoke(context, q_142);
      if(term == null)
        break Fail89;
      u_142 = term;
      term = k_31.invoke(context, r_142);
      if(term == null)
        break Fail89;
      v_142 = term;
      term = l_31.invoke(context, s_142);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEnumDecHead_3, new IStrategoTerm[]{u_142, v_142, term}), checkListAnnos(termFactory, t_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}