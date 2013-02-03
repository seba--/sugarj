package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Const$Type_1_0 extends Strategy 
{ 
  public static $Const$Type_1_0 instance = new $Const$Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstType_1_0");
    Fail113:
    { 
      IStrategoTerm y_109 = null;
      IStrategoTerm x_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      x_109 = term.getSubterm(0);
      IStrategoList annos101 = term.getAnnotations();
      y_109 = annos101;
      term = d_17.invoke(context, x_109);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}