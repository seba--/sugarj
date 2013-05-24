package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constructor$Only_1_0 extends Strategy 
{ 
  public static $Constructor$Only_1_0 instance = new $Constructor$Only_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstructorOnly_1_0");
    Fail844:
    { 
      IStrategoTerm u_437 = null;
      IStrategoTerm t_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consConstructorOnly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail844;
      t_437 = term.getSubterm(0);
      IStrategoList annos91 = term.getAnnotations();
      u_437 = annos91;
      term = b_339.invoke(context, t_437);
      if(term == null)
        break Fail844;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consConstructorOnly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}