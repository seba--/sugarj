package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class symbol_2_0 extends Strategy 
{ 
  public static symbol_2_0 instance = new symbol_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_27, Strategy j_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("symbol_2_0");
    Fail221:
    { 
      IStrategoTerm c_139 = null;
      IStrategoTerm a_139 = null;
      IStrategoTerm b_139 = null;
      IStrategoTerm d_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssymbol_2 != ((IStrategoAppl)term).getConstructor())
        break Fail221;
      a_139 = term.getSubterm(0);
      b_139 = term.getSubterm(1);
      IStrategoList annos181 = term.getAnnotations();
      c_139 = annos181;
      term = i_27.invoke(context, a_139);
      if(term == null)
        break Fail221;
      d_139 = term;
      term = j_27.invoke(context, b_139);
      if(term == null)
        break Fail221;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssymbol_2, new IStrategoTerm[]{d_139, term}), checkListAnnos(termFactory, c_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}