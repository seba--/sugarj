package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PureDesugaring_1_0");
    Fail753:
    { 
      IStrategoTerm s_426 = null;
      IStrategoTerm r_426 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPureDesugaring_1 != ((IStrategoAppl)term).getConstructor())
        break Fail753;
      r_426 = term.getSubterm(0);
      IStrategoList annos25 = term.getAnnotations();
      s_426 = annos25;
      term = q_334.invoke(context, r_426);
      if(term == null)
        break Fail753;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPureDesugaring_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}