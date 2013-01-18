package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled_2_0 extends Strategy 
{ 
  public static $Labeled_2_0 instance = new $Labeled_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_34, Strategy r_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Labeled_2_0");
    Fail130:
    { 
      IStrategoTerm a_154 = null;
      IStrategoTerm v_153 = null;
      IStrategoTerm z_153 = null;
      IStrategoTerm b_154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeled_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      v_153 = term.getSubterm(0);
      z_153 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      a_154 = annos103;
      term = q_34.invoke(context, v_153);
      if(term == null)
        break Fail130;
      b_154 = term;
      term = r_34.invoke(context, z_153);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeled_2, new IStrategoTerm[]{b_154, term}), checkListAnnos(termFactory, a_154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}