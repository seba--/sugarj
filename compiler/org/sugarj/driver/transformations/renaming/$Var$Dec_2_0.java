package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_2_0 extends Strategy 
{ 
  public static $Var$Dec_2_0 instance = new $Var$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_12, Strategy p_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail51:
    { 
      IStrategoTerm p_97 = null;
      IStrategoTerm n_97 = null;
      IStrategoTerm o_97 = null;
      IStrategoTerm q_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      n_97 = term.getSubterm(0);
      o_97 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      p_97 = annos41;
      term = o_12.invoke(context, n_97);
      if(term == null)
        break Fail51;
      q_97 = term;
      term = p_12.invoke(context, o_97);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consVarDec_2, new IStrategoTerm[]{q_97, term}), checkListAnnos(termFactory, p_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}