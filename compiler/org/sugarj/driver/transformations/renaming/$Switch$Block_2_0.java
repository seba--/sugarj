package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Block_2_0 extends Strategy 
{ 
  public static $Switch$Block_2_0 instance = new $Switch$Block_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_33, Strategy i_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchBlock_2_0");
    Fail112:
    { 
      IStrategoTerm z_148 = null;
      IStrategoTerm x_148 = null;
      IStrategoTerm y_148 = null;
      IStrategoTerm a_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchBlock_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      x_148 = term.getSubterm(0);
      y_148 = term.getSubterm(1);
      IStrategoList annos85 = term.getAnnotations();
      z_148 = annos85;
      term = h_33.invoke(context, x_148);
      if(term == null)
        break Fail112;
      a_149 = term;
      term = i_33.invoke(context, y_148);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchBlock_2, new IStrategoTerm[]{a_149, term}), checkListAnnos(termFactory, z_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}