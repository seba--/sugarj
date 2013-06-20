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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstType_1_0");
    Fail140:
    { 
      IStrategoTerm u_123 = null;
      IStrategoTerm t_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consConstType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      t_123 = term.getSubterm(0);
      IStrategoList annos110 = term.getAnnotations();
      u_123 = annos110;
      term = k_23.invoke(context, t_123);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consConstType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}