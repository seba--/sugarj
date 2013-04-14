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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_14, Strategy l_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail67:
    { 
      IStrategoTerm i_102 = null;
      IStrategoTerm g_102 = null;
      IStrategoTerm h_102 = null;
      IStrategoTerm j_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      g_102 = term.getSubterm(0);
      h_102 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      i_102 = annos58;
      term = k_14.invoke(context, g_102);
      if(term == null)
        break Fail67;
      j_102 = term;
      term = l_14.invoke(context, h_102);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{j_102, term}), checkListAnnos(termFactory, i_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}