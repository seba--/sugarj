package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$No$Args_2_0 extends Strategy 
{ 
  public static $S$Def$No$Args_2_0 instance = new $S$Def$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_43, Strategy i_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail289:
    { 
      IStrategoTerm r_182 = null;
      IStrategoTerm p_182 = null;
      IStrategoTerm q_182 = null;
      IStrategoTerm s_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail289;
      p_182 = term.getSubterm(0);
      q_182 = term.getSubterm(1);
      IStrategoList annos236 = term.getAnnotations();
      r_182 = annos236;
      term = h_43.invoke(context, p_182);
      if(term == null)
        break Fail289;
      s_182 = term;
      term = i_43.invoke(context, q_182);
      if(term == null)
        break Fail289;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefNoArgs_2, new IStrategoTerm[]{s_182, term}), checkListAnnos(termFactory, r_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}