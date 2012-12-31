package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str$Cong_1_0 extends Strategy 
{ 
  public static $Str$Cong_1_0 instance = new $Str$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrCong_1_0");
    Fail321:
    { 
      IStrategoTerm h_189 = null;
      IStrategoTerm f_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail321;
      f_189 = term.getSubterm(0);
      IStrategoList annos267 = term.getAnnotations();
      h_189 = annos267;
      term = v_45.invoke(context, f_189);
      if(term == null)
        break Fail321;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}