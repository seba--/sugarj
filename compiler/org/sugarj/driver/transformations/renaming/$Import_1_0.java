package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import_1_0 extends Strategy 
{ 
  public static $Import_1_0 instance = new $Import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail278:
    { 
      IStrategoTerm u_180 = null;
      IStrategoTerm t_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail278;
      t_180 = term.getSubterm(0);
      IStrategoList annos225 = term.getAnnotations();
      u_180 = annos225;
      term = t_42.invoke(context, t_180);
      if(term == null)
        break Fail278;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_180));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}