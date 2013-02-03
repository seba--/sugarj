package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong$No$Tail_1_0 extends Strategy 
{ 
  public static $List$Cong$No$Tail_1_0 instance = new $List$Cong$No$Tail_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail77:
    { 
      IStrategoTerm d_104 = null;
      IStrategoTerm c_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      c_104 = term.getSubterm(0);
      IStrategoList annos68 = term.getAnnotations();
      d_104 = annos68;
      term = c_15.invoke(context, c_104);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}