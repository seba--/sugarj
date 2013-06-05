package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_syntax_1_0 extends Strategy 
{ 
  public static lexical_syntax_1_0 instance = new lexical_syntax_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_syntax_1_0");
    Fail268:
    { 
      IStrategoTerm d_148 = null;
      IStrategoTerm c_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslexical_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail268;
      c_148 = term.getSubterm(0);
      IStrategoList annos220 = term.getAnnotations();
      d_148 = annos220;
      term = h_29.invoke(context, c_148);
      if(term == null)
        break Fail268;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslexical_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}