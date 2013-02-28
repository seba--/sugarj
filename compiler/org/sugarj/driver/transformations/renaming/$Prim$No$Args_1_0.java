package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$No$Args_1_0 extends Strategy 
{ 
  public static $Prim$No$Args_1_0 instance = new $Prim$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail88:
    { 
      IStrategoTerm k_105 = null;
      IStrategoTerm j_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      j_105 = term.getSubterm(0);
      IStrategoList annos77 = term.getAnnotations();
      k_105 = annos77;
      term = m_15.invoke(context, j_105);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}