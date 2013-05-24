package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class grammar_elem_1_0 extends Strategy 
{ 
  public static grammar_elem_1_0 instance = new grammar_elem_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("grammar_elem_1_0");
    Fail736:
    { 
      IStrategoTerm t_424 = null;
      IStrategoTerm s_424 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail736;
      s_424 = term.getSubterm(0);
      IStrategoList annos8 = term.getAnnotations();
      t_424 = annos8;
      term = z_333.invoke(context, s_424);
      if(term == null)
        break Fail736;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consgrammar_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_424));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}