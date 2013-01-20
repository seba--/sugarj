package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$Dynamic_3_0 extends Strategy 
{ 
  public static $Call$Dynamic_3_0 instance = new $Call$Dynamic_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_47, Strategy b_47, Strategy c_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail343:
    { 
      IStrategoTerm y_192 = null;
      IStrategoTerm v_192 = null;
      IStrategoTerm w_192 = null;
      IStrategoTerm x_192 = null;
      IStrategoTerm z_192 = null;
      IStrategoTerm a_193 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail343;
      v_192 = term.getSubterm(0);
      w_192 = term.getSubterm(1);
      x_192 = term.getSubterm(2);
      IStrategoList annos287 = term.getAnnotations();
      y_192 = annos287;
      term = a_47.invoke(context, v_192);
      if(term == null)
        break Fail343;
      z_192 = term;
      term = b_47.invoke(context, w_192);
      if(term == null)
        break Fail343;
      a_193 = term;
      term = c_47.invoke(context, x_192);
      if(term == null)
        break Fail343;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallDynamic_3, new IStrategoTerm[]{z_192, a_193, term}), checkListAnnos(termFactory, y_192));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}