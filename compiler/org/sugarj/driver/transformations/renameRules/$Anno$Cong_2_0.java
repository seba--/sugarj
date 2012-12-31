package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_15, Strategy b_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail77:
    { 
      IStrategoTerm i_104 = null;
      IStrategoTerm f_104 = null;
      IStrategoTerm h_104 = null;
      IStrategoTerm j_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      f_104 = term.getSubterm(0);
      h_104 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      i_104 = annos70;
      term = a_15.invoke(context, f_104);
      if(term == null)
        break Fail77;
      j_104 = term;
      term = b_15.invoke(context, h_104);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoCong_2, new IStrategoTerm[]{j_104, term}), checkListAnnos(termFactory, i_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}