package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_14, Strategy p_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail68:
    { 
      IStrategoTerm z_102 = null;
      IStrategoTerm x_102 = null;
      IStrategoTerm y_102 = null;
      IStrategoTerm a_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      x_102 = term.getSubterm(0);
      y_102 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      z_102 = annos62;
      term = o_14.invoke(context, x_102);
      if(term == null)
        break Fail68;
      a_103 = term;
      term = p_14.invoke(context, y_102);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChoice_2, new IStrategoTerm[]{a_103, term}), checkListAnnos(termFactory, z_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}