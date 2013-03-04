package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Left$Shift_2_0 extends Strategy 
{ 
  public static $Left$Shift_2_0 instance = new $Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_37, Strategy f_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LeftShift_2_0");
    Fail167:
    { 
      IStrategoTerm b_163 = null;
      IStrategoTerm z_162 = null;
      IStrategoTerm a_163 = null;
      IStrategoTerm c_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail167;
      z_162 = term.getSubterm(0);
      a_163 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      b_163 = annos137;
      term = e_37.invoke(context, z_162);
      if(term == null)
        break Fail167;
      c_163 = term;
      term = f_37.invoke(context, a_163);
      if(term == null)
        break Fail167;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLeftShift_2, new IStrategoTerm[]{c_163, term}), checkListAnnos(termFactory, b_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}