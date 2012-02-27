package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec_2_0 extends Strategy 
{ 
  public static $Enum$Dec_2_0 instance = new $Enum$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_18, Strategy c_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDec_2_0");
    Fail54:
    { 
      IStrategoTerm h_108 = null;
      IStrategoTerm f_108 = null;
      IStrategoTerm g_108 = null;
      IStrategoTerm i_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      f_108 = term.getSubterm(0);
      g_108 = term.getSubterm(1);
      IStrategoList annos40 = term.getAnnotations();
      h_108 = annos40;
      term = b_18.invoke(context, f_108);
      if(term == null)
        break Fail54;
      i_108 = term;
      term = c_18.invoke(context, g_108);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDec_2, new IStrategoTerm[]{i_108, term}), checkListAnnos(termFactory, h_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}