package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec_2_0 extends Strategy 
{ 
  public static $Class$Dec_2_0 instance = new $Class$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_29, Strategy w_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDec_2_0");
    Fail75:
    { 
      IStrategoTerm t_136 = null;
      IStrategoTerm q_136 = null;
      IStrategoTerm s_136 = null;
      IStrategoTerm u_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      q_136 = term.getSubterm(0);
      s_136 = term.getSubterm(1);
      IStrategoList annos51 = term.getAnnotations();
      t_136 = annos51;
      term = v_29.invoke(context, q_136);
      if(term == null)
        break Fail75;
      u_136 = term;
      term = w_29.invoke(context, s_136);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClassDec_2, new IStrategoTerm[]{u_136, term}), checkListAnnos(termFactory, t_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}