package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_44, Strategy u_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail303:
    { 
      IStrategoTerm k_186 = null;
      IStrategoTerm i_186 = null;
      IStrategoTerm j_186 = null;
      IStrategoTerm l_186 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail303;
      i_186 = term.getSubterm(0);
      j_186 = term.getSubterm(1);
      IStrategoList annos250 = term.getAnnotations();
      k_186 = annos250;
      term = t_44.invoke(context, i_186);
      if(term == null)
        break Fail303;
      l_186 = term;
      term = u_44.invoke(context, j_186);
      if(term == null)
        break Fail303;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{l_186, term}), checkListAnnos(termFactory, k_186));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}