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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_27, Strategy k_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("label_2_0");
    Fail224:
    { 
      IStrategoTerm f_139 = null;
      IStrategoTerm d_139 = null;
      IStrategoTerm e_139 = null;
      IStrategoTerm g_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail224;
      d_139 = term.getSubterm(0);
      e_139 = term.getSubterm(1);
      IStrategoList annos182 = term.getAnnotations();
      f_139 = annos182;
      term = j_27.invoke(context, d_139);
      if(term == null)
        break Fail224;
      g_139 = term;
      term = k_27.invoke(context, e_139);
      if(term == null)
        break Fail224;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslabel_2, new IStrategoTerm[]{g_139, term}), checkListAnnos(termFactory, f_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}