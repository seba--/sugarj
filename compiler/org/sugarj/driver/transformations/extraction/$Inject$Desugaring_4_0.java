package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Inject$Desugaring_4_0 extends Strategy 
{ 
  public static $Inject$Desugaring_4_0 instance = new $Inject$Desugaring_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_334, Strategy s_334, Strategy t_334, Strategy u_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InjectDesugaring_4_0");
    Fail754:
    { 
      IStrategoTerm y_426 = null;
      IStrategoTerm u_426 = null;
      IStrategoTerm v_426 = null;
      IStrategoTerm w_426 = null;
      IStrategoTerm x_426 = null;
      IStrategoTerm z_426 = null;
      IStrategoTerm a_427 = null;
      IStrategoTerm b_427 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consInjectDesugaring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail754;
      u_426 = term.getSubterm(0);
      v_426 = term.getSubterm(1);
      w_426 = term.getSubterm(2);
      x_426 = term.getSubterm(3);
      IStrategoList annos26 = term.getAnnotations();
      y_426 = annos26;
      term = r_334.invoke(context, u_426);
      if(term == null)
        break Fail754;
      z_426 = term;
      term = s_334.invoke(context, v_426);
      if(term == null)
        break Fail754;
      a_427 = term;
      term = t_334.invoke(context, w_426);
      if(term == null)
        break Fail754;
      b_427 = term;
      term = u_334.invoke(context, x_426);
      if(term == null)
        break Fail754;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consInjectDesugaring_4, new IStrategoTerm[]{z_426, a_427, b_427, term}), checkListAnnos(termFactory, y_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}