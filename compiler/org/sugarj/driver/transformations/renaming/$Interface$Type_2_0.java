package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Type_2_0 extends Strategy 
{ 
  public static $Interface$Type_2_0 instance = new $Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_38, Strategy y_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceType_2_0");
    Fail193:
    { 
      IStrategoTerm d_169 = null;
      IStrategoTerm b_169 = null;
      IStrategoTerm c_169 = null;
      IStrategoTerm e_169 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      b_169 = term.getSubterm(0);
      c_169 = term.getSubterm(1);
      IStrategoList annos162 = term.getAnnotations();
      d_169 = annos162;
      term = x_38.invoke(context, b_169);
      if(term == null)
        break Fail193;
      e_169 = term;
      term = y_38.invoke(context, c_169);
      if(term == null)
        break Fail193;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInterfaceType_2, new IStrategoTerm[]{e_169, term}), checkListAnnos(termFactory, d_169));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}