package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constructor_1_0 extends Strategy 
{ 
  public static $Constructor_1_0 instance = new $Constructor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructor_1_0");
    Fail845:
    { 
      IStrategoTerm x_437 = null;
      IStrategoTerm w_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consConstructor_1 != ((IStrategoAppl)term).getConstructor())
        break Fail845;
      w_437 = term.getSubterm(0);
      IStrategoList annos92 = term.getAnnotations();
      x_437 = annos92;
      term = c_339.invoke(context, w_437);
      if(term == null)
        break Fail845;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consConstructor_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}