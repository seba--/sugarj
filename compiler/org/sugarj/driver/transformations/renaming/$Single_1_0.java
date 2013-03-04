package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single_1_0 extends Strategy 
{ 
  public static $Single_1_0 instance = new $Single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Single_1_0");
    Fail225:
    { 
      IStrategoTerm e_173 = null;
      IStrategoTerm d_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail225;
      d_173 = term.getSubterm(0);
      IStrategoList annos185 = term.getAnnotations();
      e_173 = annos185;
      term = d_40.invoke(context, d_173);
      if(term == null)
        break Fail225;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}