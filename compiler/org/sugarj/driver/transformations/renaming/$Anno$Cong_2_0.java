package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Cong_2_0 extends Strategy 
{ 
  public static $Anno$Cong_2_0 instance = new $Anno$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_14, Strategy a_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail81:
    { 
      IStrategoTerm h_104 = null;
      IStrategoTerm e_104 = null;
      IStrategoTerm f_104 = null;
      IStrategoTerm i_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      e_104 = term.getSubterm(0);
      f_104 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      h_104 = annos70;
      term = z_14.invoke(context, e_104);
      if(term == null)
        break Fail81;
      i_104 = term;
      term = a_15.invoke(context, f_104);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoCong_2, new IStrategoTerm[]{i_104, term}), checkListAnnos(termFactory, h_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}