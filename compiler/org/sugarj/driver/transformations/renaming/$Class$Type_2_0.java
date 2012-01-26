package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Type_2_0 extends Strategy 
{ 
  public static $Class$Type_2_0 instance = new $Class$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_24, Strategy s_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassType_2_0");
    Fail153:
    { 
      IStrategoTerm c_128 = null;
      IStrategoTerm a_128 = null;
      IStrategoTerm b_128 = null;
      IStrategoTerm d_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      a_128 = term.getSubterm(0);
      b_128 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      c_128 = annos137;
      term = r_24.invoke(context, a_128);
      if(term == null)
        break Fail153;
      d_128 = term;
      term = s_24.invoke(context, b_128);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassType_2, new IStrategoTerm[]{d_128, term}), checkListAnnos(termFactory, c_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}