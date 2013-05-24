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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_344, Strategy l_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail922:
    { 
      IStrategoTerm l_451 = null;
      IStrategoTerm j_451 = null;
      IStrategoTerm k_451 = null;
      IStrategoTerm m_451 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail922;
      j_451 = term.getSubterm(0);
      k_451 = term.getSubterm(1);
      IStrategoList annos167 = term.getAnnotations();
      l_451 = annos167;
      term = k_344.invoke(context, j_451);
      if(term == null)
        break Fail922;
      m_451 = term;
      term = l_344.invoke(context, k_451);
      if(term == null)
        break Fail922;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{m_451, term}), checkListAnnos(termFactory, l_451));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}