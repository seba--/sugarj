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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_45, Strategy x_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prim_2_0");
    Fail322:
    { 
      IStrategoTerm l_189 = null;
      IStrategoTerm j_189 = null;
      IStrategoTerm k_189 = null;
      IStrategoTerm m_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail322;
      j_189 = term.getSubterm(0);
      k_189 = term.getSubterm(1);
      IStrategoList annos268 = term.getAnnotations();
      l_189 = annos268;
      term = w_45.invoke(context, j_189);
      if(term == null)
        break Fail322;
      m_189 = term;
      term = x_45.invoke(context, k_189);
      if(term == null)
        break Fail322;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrim_2, new IStrategoTerm[]{m_189, term}), checkListAnnos(termFactory, l_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}