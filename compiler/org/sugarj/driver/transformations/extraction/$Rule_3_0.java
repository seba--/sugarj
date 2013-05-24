package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule_3_0 extends Strategy 
{ 
  public static $Rule_3_0 instance = new $Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_342, Strategy k_342, Strategy l_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail887:
    { 
      IStrategoTerm c_446 = null;
      IStrategoTerm z_445 = null;
      IStrategoTerm a_446 = null;
      IStrategoTerm b_446 = null;
      IStrategoTerm d_446 = null;
      IStrategoTerm e_446 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail887;
      z_445 = term.getSubterm(0);
      a_446 = term.getSubterm(1);
      b_446 = term.getSubterm(2);
      IStrategoList annos133 = term.getAnnotations();
      c_446 = annos133;
      term = j_342.invoke(context, z_445);
      if(term == null)
        break Fail887;
      d_446 = term;
      term = k_342.invoke(context, a_446);
      if(term == null)
        break Fail887;
      e_446 = term;
      term = l_342.invoke(context, b_446);
      if(term == null)
        break Fail887;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRule_3, new IStrategoTerm[]{d_446, e_446, term}), checkListAnnos(termFactory, c_446));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}