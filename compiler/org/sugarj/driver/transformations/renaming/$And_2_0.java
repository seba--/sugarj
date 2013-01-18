package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_36, Strategy j_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail156:
    { 
      IStrategoTerm b_160 = null;
      IStrategoTerm z_159 = null;
      IStrategoTerm a_160 = null;
      IStrategoTerm c_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      z_159 = term.getSubterm(0);
      a_160 = term.getSubterm(1);
      IStrategoList annos126 = term.getAnnotations();
      b_160 = annos126;
      term = i_36.invoke(context, z_159);
      if(term == null)
        break Fail156;
      c_160 = term;
      term = j_36.invoke(context, a_160);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnd_2, new IStrategoTerm[]{c_160, term}), checkListAnnos(termFactory, b_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}