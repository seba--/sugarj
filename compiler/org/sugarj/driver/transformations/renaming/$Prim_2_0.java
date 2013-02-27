package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim_2_0 extends Strategy 
{ 
  public static $Prim_2_0 instance = new $Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_15, Strategy i_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail87:
    { 
      IStrategoTerm d_105 = null;
      IStrategoTerm b_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm e_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      b_105 = term.getSubterm(0);
      c_105 = term.getSubterm(1);
      IStrategoList annos76 = term.getAnnotations();
      d_105 = annos76;
      term = h_15.invoke(context, b_105);
      if(term == null)
        break Fail87;
      e_105 = term;
      term = i_15.invoke(context, c_105);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrim_2, new IStrategoTerm[]{e_105, term}), checkListAnnos(termFactory, d_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}