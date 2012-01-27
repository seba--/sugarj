package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Exc$Or_2_0 extends Strategy 
{ 
  public static $Exc$Or_2_0 instance = new $Exc$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_21, Strategy z_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExcOr_2_0");
    Fail114:
    { 
      IStrategoTerm c_120 = null;
      IStrategoTerm y_119 = null;
      IStrategoTerm z_119 = null;
      IStrategoTerm g_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      y_119 = term.getSubterm(0);
      z_119 = term.getSubterm(1);
      IStrategoList annos99 = term.getAnnotations();
      c_120 = annos99;
      term = y_21.invoke(context, y_119);
      if(term == null)
        break Fail114;
      g_120 = term;
      term = z_21.invoke(context, z_119);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExcOr_2, new IStrategoTerm[]{g_120, term}), checkListAnnos(termFactory, c_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}