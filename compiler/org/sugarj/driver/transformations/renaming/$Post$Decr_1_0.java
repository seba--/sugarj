package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Decr_1_0 extends Strategy 
{ 
  public static $Post$Decr_1_0 instance = new $Post$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostDecr_1_0");
    Fail182:
    { 
      IStrategoTerm a_167 = null;
      IStrategoTerm z_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      z_166 = term.getSubterm(0);
      IStrategoList annos152 = term.getAnnotations();
      a_167 = annos152;
      term = c_38.invoke(context, z_166);
      if(term == null)
        break Fail182;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPostDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_167));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}