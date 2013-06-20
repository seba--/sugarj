package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lex_1_0 extends Strategy 
{ 
  public static lex_1_0 instance = new lex_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lex_1_0");
    Fail241:
    { 
      IStrategoTerm t_143 = null;
      IStrategoTerm s_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslex_1 != ((IStrategoAppl)term).getConstructor())
        break Fail241;
      s_143 = term.getSubterm(0);
      IStrategoList annos198 = term.getAnnotations();
      t_143 = annos198;
      term = h_28.invoke(context, s_143);
      if(term == null)
        break Fail241;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslex_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}