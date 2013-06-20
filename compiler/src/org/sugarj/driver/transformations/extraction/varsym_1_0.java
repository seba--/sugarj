package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class varsym_1_0 extends Strategy 
{ 
  public static varsym_1_0 instance = new varsym_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("varsym_1_0");
    Fail240:
    { 
      IStrategoTerm q_143 = null;
      IStrategoTerm p_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consvarsym_1 != ((IStrategoAppl)term).getConstructor())
        break Fail240;
      p_143 = term.getSubterm(0);
      IStrategoList annos197 = term.getAnnotations();
      q_143 = annos197;
      term = g_28.invoke(context, p_143);
      if(term == null)
        break Fail240;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consvarsym_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}