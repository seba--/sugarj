package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str_1_0 extends Strategy 
{ 
  public static $Str_1_0 instance = new $Str_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_49)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Str_1_0");
    Fail377:
    { 
      IStrategoTerm t_198 = null;
      IStrategoTerm s_198 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail377;
      s_198 = term.getSubterm(0);
      IStrategoList annos320 = term.getAnnotations();
      t_198 = annos320;
      term = a_49.invoke(context, s_198);
      if(term == null)
        break Fail377;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_198));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}