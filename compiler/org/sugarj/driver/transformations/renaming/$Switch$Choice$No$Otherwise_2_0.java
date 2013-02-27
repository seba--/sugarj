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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_14, Strategy f_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail68:
    { 
      IStrategoTerm c_102 = null;
      IStrategoTerm a_102 = null;
      IStrategoTerm b_102 = null;
      IStrategoTerm d_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      a_102 = term.getSubterm(0);
      b_102 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      c_102 = annos58;
      term = e_14.invoke(context, a_102);
      if(term == null)
        break Fail68;
      d_102 = term;
      term = f_14.invoke(context, b_102);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{d_102, term}), checkListAnnos(termFactory, c_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}