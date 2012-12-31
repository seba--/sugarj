package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Model$Dec_2_0 extends Strategy 
{ 
  public static $Model$Dec_2_0 instance = new $Model$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_27, Strategy p_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ModelDec_2_0");
    Fail41:
    { 
      IStrategoTerm a_127 = null;
      IStrategoTerm y_126 = null;
      IStrategoTerm z_126 = null;
      IStrategoTerm b_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModelDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      y_126 = term.getSubterm(0);
      z_126 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      a_127 = annos18;
      term = o_27.invoke(context, y_126);
      if(term == null)
        break Fail41;
      b_127 = term;
      term = p_27.invoke(context, z_126);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModelDec_2, new IStrategoTerm[]{b_127, term}), checkListAnnos(termFactory, a_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}