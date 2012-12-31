package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List_1_0 extends Strategy 
{ 
  public static $List_1_0 instance = new $List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("List_1_0");
    Fail371:
    { 
      IStrategoTerm u_197 = null;
      IStrategoTerm t_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail371;
      t_197 = term.getSubterm(0);
      IStrategoList annos314 = term.getAnnotations();
      u_197 = annos314;
      term = r_48.invoke(context, t_197);
      if(term == null)
        break Fail371;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_197));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}