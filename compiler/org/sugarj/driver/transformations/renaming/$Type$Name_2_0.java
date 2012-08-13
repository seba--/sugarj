package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Name_2_0 extends Strategy 
{ 
  public static $Type$Name_2_0 instance = new $Type$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_31, Strategy n_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeName_2_0");
    Fail219:
    { 
      IStrategoTerm d_150 = null;
      IStrategoTerm b_150 = null;
      IStrategoTerm c_150 = null;
      IStrategoTerm e_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail219;
      b_150 = term.getSubterm(0);
      c_150 = term.getSubterm(1);
      IStrategoList annos193 = term.getAnnotations();
      d_150 = annos193;
      term = m_31.invoke(context, b_150);
      if(term == null)
        break Fail219;
      e_150 = term;
      term = n_31.invoke(context, c_150);
      if(term == null)
        break Fail219;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeName_2, new IStrategoTerm[]{e_150, term}), checkListAnnos(termFactory, d_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}