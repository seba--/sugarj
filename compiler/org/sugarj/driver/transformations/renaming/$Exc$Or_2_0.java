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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_27, Strategy z_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExcOr_2_0");
    Fail165:
    { 
      IStrategoTerm c_137 = null;
      IStrategoTerm a_137 = null;
      IStrategoTerm b_137 = null;
      IStrategoTerm d_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      a_137 = term.getSubterm(0);
      b_137 = term.getSubterm(1);
      IStrategoList annos140 = term.getAnnotations();
      c_137 = annos140;
      term = y_27.invoke(context, a_137);
      if(term == null)
        break Fail165;
      d_137 = term;
      term = z_27.invoke(context, b_137);
      if(term == null)
        break Fail165;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExcOr_2, new IStrategoTerm[]{d_137, term}), checkListAnnos(termFactory, c_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}