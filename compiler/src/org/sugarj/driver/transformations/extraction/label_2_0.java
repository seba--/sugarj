package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class label_2_0 extends Strategy 
{ 
  public static label_2_0 instance = new label_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_27, Strategy m_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("label_2_0");
    Fail225:
    { 
      IStrategoTerm k_139 = null;
      IStrategoTerm i_139 = null;
      IStrategoTerm j_139 = null;
      IStrategoTerm l_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail225;
      i_139 = term.getSubterm(0);
      j_139 = term.getSubterm(1);
      IStrategoList annos183 = term.getAnnotations();
      k_139 = annos183;
      term = l_27.invoke(context, i_139);
      if(term == null)
        break Fail225;
      l_139 = term;
      term = m_27.invoke(context, j_139);
      if(term == null)
        break Fail225;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslabel_2, new IStrategoTerm[]{l_139, term}), checkListAnnos(termFactory, k_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}