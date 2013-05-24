package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Semantic$Observer_1_0 extends Strategy 
{ 
  public static $Semantic$Observer_1_0 instance = new $Semantic$Observer_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SemanticObserver_1_0");
    Fail760:
    { 
      IStrategoTerm d_428 = null;
      IStrategoTerm c_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSemanticObserver_1 != ((IStrategoAppl)term).getConstructor())
        break Fail760;
      c_428 = term.getSubterm(0);
      IStrategoList annos32 = term.getAnnotations();
      d_428 = annos32;
      term = f_335.invoke(context, c_428);
      if(term == null)
        break Fail760;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSemanticObserver_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_428));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}