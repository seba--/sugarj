package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstType_1_0");
    Fail956:
    { 
      IStrategoTerm i_456 = null;
      IStrategoTerm h_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consConstType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail956;
      h_456 = term.getSubterm(0);
      IStrategoList annos199 = term.getAnnotations();
      i_456 = annos199;
      term = g_346.invoke(context, h_456);
      if(term == null)
        break Fail956;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consConstType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}