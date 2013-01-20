package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Dec$Head_2_0 extends Strategy 
{ 
  public static $Sugar$Dec$Head_2_0 instance = new $Sugar$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_27, Strategy d_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarDecHead_2_0");
    Fail34:
    { 
      IStrategoTerm v_125 = null;
      IStrategoTerm t_125 = null;
      IStrategoTerm u_125 = null;
      IStrategoTerm w_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSugarDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      t_125 = term.getSubterm(0);
      u_125 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      v_125 = annos11;
      term = c_27.invoke(context, t_125);
      if(term == null)
        break Fail34;
      w_125 = term;
      term = d_27.invoke(context, u_125);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSugarDecHead_2, new IStrategoTerm[]{w_125, term}), checkListAnnos(termFactory, v_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}