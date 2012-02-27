package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_2_0 extends Strategy 
{ 
  public static $Minus_2_0 instance = new $Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_23, Strategy w_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_2_0");
    Fail132:
    { 
      IStrategoTerm c_124 = null;
      IStrategoTerm z_123 = null;
      IStrategoTerm b_124 = null;
      IStrategoTerm d_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      z_123 = term.getSubterm(0);
      b_124 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      c_124 = annos112;
      term = v_23.invoke(context, z_123);
      if(term == null)
        break Fail132;
      d_124 = term;
      term = w_23.invoke(context, b_124);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_2, new IStrategoTerm[]{d_124, term}), checkListAnnos(termFactory, c_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}