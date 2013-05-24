package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_343, Strategy h_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail902:
    { 
      IStrategoTerm k_448 = null;
      IStrategoTerm i_448 = null;
      IStrategoTerm j_448 = null;
      IStrategoTerm l_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail902;
      i_448 = term.getSubterm(0);
      j_448 = term.getSubterm(1);
      IStrategoList annos148 = term.getAnnotations();
      k_448 = annos148;
      term = g_343.invoke(context, i_448);
      if(term == null)
        break Fail902;
      l_448 = term;
      term = h_343.invoke(context, j_448);
      if(term == null)
        break Fail902;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPrim_2, new IStrategoTerm[]{l_448, term}), checkListAnnos(termFactory, k_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}