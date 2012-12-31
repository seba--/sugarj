package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_15, Strategy j_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail83:
    { 
      IStrategoTerm e_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm d_105 = null;
      IStrategoTerm f_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      c_105 = term.getSubterm(0);
      d_105 = term.getSubterm(1);
      IStrategoList annos76 = term.getAnnotations();
      e_105 = annos76;
      term = i_15.invoke(context, c_105);
      if(term == null)
        break Fail83;
      f_105 = term;
      term = j_15.invoke(context, d_105);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrim_2, new IStrategoTerm[]{f_105, term}), checkListAnnos(termFactory, e_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}