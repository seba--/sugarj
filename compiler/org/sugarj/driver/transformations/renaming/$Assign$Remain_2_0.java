package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Remain_2_0 extends Strategy 
{ 
  public static $Assign$Remain_2_0 instance = new $Assign$Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_22, Strategy m_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRemain_2_0");
    Fail114:
    { 
      IStrategoTerm z_119 = null;
      IStrategoTerm x_119 = null;
      IStrategoTerm y_119 = null;
      IStrategoTerm c_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      x_119 = term.getSubterm(0);
      y_119 = term.getSubterm(1);
      IStrategoList annos94 = term.getAnnotations();
      z_119 = annos94;
      term = l_22.invoke(context, x_119);
      if(term == null)
        break Fail114;
      c_120 = term;
      term = m_22.invoke(context, y_119);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRemain_2, new IStrategoTerm[]{c_120, term}), checkListAnnos(termFactory, z_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}