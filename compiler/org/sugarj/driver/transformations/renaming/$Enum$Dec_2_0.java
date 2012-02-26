package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec_2_0 extends Strategy 
{ 
  public static $Enum$Dec_2_0 instance = new $Enum$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17, Strategy u_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDec_2_0");
    Fail52:
    { 
      IStrategoTerm z_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm a_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      x_107 = term.getSubterm(0);
      y_107 = term.getSubterm(1);
      IStrategoList annos40 = term.getAnnotations();
      z_107 = annos40;
      term = t_17.invoke(context, x_107);
      if(term == null)
        break Fail52;
      a_108 = term;
      term = u_17.invoke(context, y_107);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDec_2, new IStrategoTerm[]{a_108, term}), checkListAnnos(termFactory, z_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}