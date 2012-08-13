package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Model$Dec$Head_3_0 extends Strategy 
{ 
  public static $Model$Dec$Head_3_0 instance = new $Model$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_19, Strategy p_19, Strategy q_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ModelDecHead_3_0");
    Fail56:
    { 
      IStrategoTerm r_110 = null;
      IStrategoTerm o_110 = null;
      IStrategoTerm p_110 = null;
      IStrategoTerm q_110 = null;
      IStrategoTerm s_110 = null;
      IStrategoTerm t_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consModelDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      o_110 = term.getSubterm(0);
      p_110 = term.getSubterm(1);
      q_110 = term.getSubterm(2);
      IStrategoList annos38 = term.getAnnotations();
      r_110 = annos38;
      term = o_19.invoke(context, o_110);
      if(term == null)
        break Fail56;
      s_110 = term;
      term = p_19.invoke(context, p_110);
      if(term == null)
        break Fail56;
      t_110 = term;
      term = q_19.invoke(context, q_110);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consModelDecHead_3, new IStrategoTerm[]{s_110, t_110, term}), checkListAnnos(termFactory, r_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}