package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Str_1_0");
    Fail170:
    { 
      IStrategoTerm t_128 = null;
      IStrategoTerm s_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consStr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      s_128 = term.getSubterm(0);
      IStrategoList annos139 = term.getAnnotations();
      t_128 = annos139;
      term = a_25.invoke(context, s_128);
      if(term == null)
        break Fail170;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consStr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}