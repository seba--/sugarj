package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Dec_2_0 extends Strategy 
{ 
  public static $Method$Dec_2_0 instance = new $Method$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_19, Strategy i_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDec_2_0");
    Fail68:
    { 
      IStrategoTerm a_112 = null;
      IStrategoTerm y_111 = null;
      IStrategoTerm z_111 = null;
      IStrategoTerm b_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      y_111 = term.getSubterm(0);
      z_111 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      a_112 = annos54;
      term = h_19.invoke(context, y_111);
      if(term == null)
        break Fail68;
      b_112 = term;
      term = i_19.invoke(context, z_111);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDec_2, new IStrategoTerm[]{b_112, term}), checkListAnnos(termFactory, a_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}