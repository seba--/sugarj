package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class appl_2_0 extends Strategy 
{ 
  public static appl_2_0 instance = new appl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_29, Strategy r_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("appl_2_0");
    Fail275:
    { 
      IStrategoTerm c_149 = null;
      IStrategoTerm a_149 = null;
      IStrategoTerm b_149 = null;
      IStrategoTerm d_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail275;
      a_149 = term.getSubterm(0);
      b_149 = term.getSubterm(1);
      IStrategoList annos226 = term.getAnnotations();
      c_149 = annos226;
      term = q_29.invoke(context, a_149);
      if(term == null)
        break Fail275;
      d_149 = term;
      term = r_29.invoke(context, b_149);
      if(term == null)
        break Fail275;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consappl_2, new IStrategoTerm[]{d_149, term}), checkListAnnos(termFactory, c_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}