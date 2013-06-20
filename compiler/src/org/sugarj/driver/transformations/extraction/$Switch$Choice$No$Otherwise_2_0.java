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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_20, Strategy s_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail94:
    { 
      IStrategoTerm a_116 = null;
      IStrategoTerm y_115 = null;
      IStrategoTerm z_115 = null;
      IStrategoTerm b_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      y_115 = term.getSubterm(0);
      z_115 = term.getSubterm(1);
      IStrategoList annos67 = term.getAnnotations();
      a_116 = annos67;
      term = r_20.invoke(context, y_115);
      if(term == null)
        break Fail94;
      b_116 = term;
      term = s_20.invoke(context, z_115);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{b_116, term}), checkListAnnos(termFactory, a_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}