package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Choice$No$Otherwise_2_0 extends Strategy 
{ 
  public static $Switch$Choice$No$Otherwise_2_0 instance = new $Switch$Choice$No$Otherwise_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_20, Strategy r_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail81:
    { 
      IStrategoTerm s_115 = null;
      IStrategoTerm q_115 = null;
      IStrategoTerm r_115 = null;
      IStrategoTerm t_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      q_115 = term.getSubterm(0);
      r_115 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      s_115 = annos58;
      term = q_20.invoke(context, q_115);
      if(term == null)
        break Fail81;
      t_115 = term;
      term = r_20.invoke(context, r_115);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{t_115, term}), checkListAnnos(termFactory, s_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}