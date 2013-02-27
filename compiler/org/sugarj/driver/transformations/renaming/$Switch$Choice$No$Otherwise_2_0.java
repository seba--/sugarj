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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_14, Strategy i_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail68:
    { 
      IStrategoTerm f_102 = null;
      IStrategoTerm d_102 = null;
      IStrategoTerm e_102 = null;
      IStrategoTerm g_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      d_102 = term.getSubterm(0);
      e_102 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      f_102 = annos58;
      term = h_14.invoke(context, d_102);
      if(term == null)
        break Fail68;
      g_102 = term;
      term = i_14.invoke(context, e_102);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{g_102, term}), checkListAnnos(termFactory, f_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}