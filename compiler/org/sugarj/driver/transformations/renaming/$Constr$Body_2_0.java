package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Body_2_0 extends Strategy 
{ 
  public static $Constr$Body_2_0 instance = new $Constr$Body_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_18, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrBody_2_0");
    Fail58:
    { 
      IStrategoTerm d_109 = null;
      IStrategoTerm b_109 = null;
      IStrategoTerm c_109 = null;
      IStrategoTerm e_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrBody_2 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      b_109 = term.getSubterm(0);
      c_109 = term.getSubterm(1);
      IStrategoList annos44 = term.getAnnotations();
      d_109 = annos44;
      term = k_18.invoke(context, b_109);
      if(term == null)
        break Fail58;
      e_109 = term;
      term = l_18.invoke(context, c_109);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrBody_2, new IStrategoTerm[]{e_109, term}), checkListAnnos(termFactory, d_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}