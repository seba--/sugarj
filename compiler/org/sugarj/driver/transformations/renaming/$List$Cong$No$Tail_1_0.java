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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCongNoTail_1_0");
    Fail78:
    { 
      IStrategoTerm z_103 = null;
      IStrategoTerm x_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListCongNoTail_1 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      x_103 = term.getSubterm(0);
      IStrategoList annos68 = term.getAnnotations();
      z_103 = annos68;
      term = z_14.invoke(context, x_103);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListCongNoTail_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}