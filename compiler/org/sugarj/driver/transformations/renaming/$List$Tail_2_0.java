package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Tail_2_0 extends Strategy 
{ 
  public static $List$Tail_2_0 instance = new $List$Tail_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_48, Strategy q_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListTail_2_0");
    Fail370:
    { 
      IStrategoTerm q_197 = null;
      IStrategoTerm o_197 = null;
      IStrategoTerm p_197 = null;
      IStrategoTerm r_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListTail_2 != ((IStrategoAppl)term).getConstructor())
        break Fail370;
      o_197 = term.getSubterm(0);
      p_197 = term.getSubterm(1);
      IStrategoList annos313 = term.getAnnotations();
      q_197 = annos313;
      term = p_48.invoke(context, o_197);
      if(term == null)
        break Fail370;
      r_197 = term;
      term = q_48.invoke(context, p_197);
      if(term == null)
        break Fail370;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListTail_2, new IStrategoTerm[]{r_197, term}), checkListAnnos(termFactory, q_197));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}