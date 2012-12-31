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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstType_1_0");
    Fail348:
    { 
      IStrategoTerm f_194 = null;
      IStrategoTerm e_194 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail348;
      e_194 = term.getSubterm(0);
      IStrategoList annos292 = term.getAnnotations();
      f_194 = annos292;
      term = l_47.invoke(context, e_194);
      if(term == null)
        break Fail348;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}