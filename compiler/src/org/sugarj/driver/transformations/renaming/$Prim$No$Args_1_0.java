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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail87:
    { 
      IStrategoTerm n_105 = null;
      IStrategoTerm m_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      m_105 = term.getSubterm(0);
      IStrategoList annos77 = term.getAnnotations();
      n_105 = annos77;
      term = p_15.invoke(context, m_105);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}