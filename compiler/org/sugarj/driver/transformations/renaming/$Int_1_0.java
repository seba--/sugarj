package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_49)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail379:
    { 
      IStrategoTerm a_199 = null;
      IStrategoTerm z_198 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail379;
      z_198 = term.getSubterm(0);
      IStrategoList annos322 = term.getAnnotations();
      a_199 = annos322;
      term = c_49.invoke(context, z_198);
      if(term == null)
        break Fail379;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_199));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}