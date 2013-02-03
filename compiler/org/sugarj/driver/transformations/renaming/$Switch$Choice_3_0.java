package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Choice_3_0 extends Strategy 
{ 
  public static $Switch$Choice_3_0 instance = new $Switch$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_14, Strategy i_14, Strategy j_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail66:
    { 
      IStrategoTerm c_102 = null;
      IStrategoTerm z_101 = null;
      IStrategoTerm a_102 = null;
      IStrategoTerm b_102 = null;
      IStrategoTerm d_102 = null;
      IStrategoTerm e_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      z_101 = term.getSubterm(0);
      a_102 = term.getSubterm(1);
      b_102 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      c_102 = annos57;
      term = h_14.invoke(context, z_101);
      if(term == null)
        break Fail66;
      d_102 = term;
      term = i_14.invoke(context, a_102);
      if(term == null)
        break Fail66;
      e_102 = term;
      term = j_14.invoke(context, b_102);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoice_3, new IStrategoTerm[]{d_102, e_102, term}), checkListAnnos(termFactory, c_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}