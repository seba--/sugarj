package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op_2_0 extends Strategy 
{ 
  public static $Op_2_0 instance = new $Op_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_18, Strategy m_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Op_2_0");
    Fail143:
    { 
      IStrategoTerm i_114 = null;
      IStrategoTerm g_114 = null;
      IStrategoTerm h_114 = null;
      IStrategoTerm j_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      g_114 = term.getSubterm(0);
      h_114 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      i_114 = annos129;
      term = l_18.invoke(context, g_114);
      if(term == null)
        break Fail143;
      j_114 = term;
      term = m_18.invoke(context, h_114);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOp_2, new IStrategoTerm[]{j_114, term}), checkListAnnos(termFactory, i_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}