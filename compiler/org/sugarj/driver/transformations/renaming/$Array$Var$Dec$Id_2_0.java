package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Var$Dec$Id_2_0 extends Strategy 
{ 
  public static $Array$Var$Dec$Id_2_0 instance = new $Array$Var$Dec$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_34, Strategy x_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayVarDecId_2_0");
    Fail135:
    { 
      IStrategoTerm v_154 = null;
      IStrategoTerm t_154 = null;
      IStrategoTerm u_154 = null;
      IStrategoTerm a_155 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consArrayVarDecId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      t_154 = term.getSubterm(0);
      u_154 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      v_154 = annos106;
      term = w_34.invoke(context, t_154);
      if(term == null)
        break Fail135;
      a_155 = term;
      term = x_34.invoke(context, u_154);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consArrayVarDecId_2, new IStrategoTerm[]{a_155, term}), checkListAnnos(termFactory, v_154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}