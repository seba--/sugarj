package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_14, Strategy g_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail64:
    { 
      IStrategoTerm d_102 = null;
      IStrategoTerm b_102 = null;
      IStrategoTerm c_102 = null;
      IStrategoTerm e_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      b_102 = term.getSubterm(0);
      c_102 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      d_102 = annos58;
      term = f_14.invoke(context, b_102);
      if(term == null)
        break Fail64;
      e_102 = term;
      term = g_14.invoke(context, c_102);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{e_102, term}), checkListAnnos(termFactory, d_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}