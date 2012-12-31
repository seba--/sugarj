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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_27, Strategy r_27, Strategy s_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ModelDecHead_3_0");
    Fail42:
    { 
      IStrategoTerm j_127 = null;
      IStrategoTerm e_127 = null;
      IStrategoTerm g_127 = null;
      IStrategoTerm i_127 = null;
      IStrategoTerm k_127 = null;
      IStrategoTerm l_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModelDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      e_127 = term.getSubterm(0);
      g_127 = term.getSubterm(1);
      i_127 = term.getSubterm(2);
      IStrategoList annos19 = term.getAnnotations();
      j_127 = annos19;
      term = q_27.invoke(context, e_127);
      if(term == null)
        break Fail42;
      k_127 = term;
      term = r_27.invoke(context, g_127);
      if(term == null)
        break Fail42;
      l_127 = term;
      term = s_27.invoke(context, i_127);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModelDecHead_3, new IStrategoTerm[]{k_127, l_127, term}), checkListAnnos(termFactory, j_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}