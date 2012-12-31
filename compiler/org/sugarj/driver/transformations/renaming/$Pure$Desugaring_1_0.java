package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pure$Desugaring_1_0 extends Strategy 
{ 
  public static $Pure$Desugaring_1_0 instance = new $Pure$Desugaring_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PureDesugaring_1_0");
    Fail29:
    { 
      IStrategoTerm u_124 = null;
      IStrategoTerm t_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPureDesugaring_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      t_124 = term.getSubterm(0);
      IStrategoList annos6 = term.getAnnotations();
      u_124 = annos6;
      term = t_26.invoke(context, t_124);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPureDesugaring_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}