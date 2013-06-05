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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_20, Strategy q_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoiceNoOtherwise_2_0");
    Fail93:
    { 
      IStrategoTerm v_115 = null;
      IStrategoTerm t_115 = null;
      IStrategoTerm u_115 = null;
      IStrategoTerm w_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSwitchChoiceNoOtherwise_2 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      t_115 = term.getSubterm(0);
      u_115 = term.getSubterm(1);
      IStrategoList annos66 = term.getAnnotations();
      v_115 = annos66;
      term = p_20.invoke(context, t_115);
      if(term == null)
        break Fail93;
      w_115 = term;
      term = q_20.invoke(context, u_115);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSwitchChoiceNoOtherwise_2, new IStrategoTerm[]{w_115, term}), checkListAnnos(termFactory, v_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}