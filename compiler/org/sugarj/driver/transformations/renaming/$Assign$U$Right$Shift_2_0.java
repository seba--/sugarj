package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$U$Right$Shift_2_0 extends Strategy 
{ 
  public static $Assign$U$Right$Shift_2_0 instance = new $Assign$U$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_35, Strategy n_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignURightShift_2_0");
    Fail145:
    { 
      IStrategoTerm h_157 = null;
      IStrategoTerm d_157 = null;
      IStrategoTerm e_157 = null;
      IStrategoTerm i_157 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      d_157 = term.getSubterm(0);
      e_157 = term.getSubterm(1);
      IStrategoList annos115 = term.getAnnotations();
      h_157 = annos115;
      term = m_35.invoke(context, d_157);
      if(term == null)
        break Fail145;
      i_157 = term;
      term = n_35.invoke(context, e_157);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignURightShift_2, new IStrategoTerm[]{i_157, term}), checkListAnnos(termFactory, h_157));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}