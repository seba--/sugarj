package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Sort_1_0 extends Strategy 
{ 
  public static $List$Sort_1_0 instance = new $List$Sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListSort_1_0");
    Fail842:
    { 
      IStrategoTerm o_437 = null;
      IStrategoTerm n_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consListSort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail842;
      n_437 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      o_437 = annos89;
      term = z_338.invoke(context, n_437);
      if(term == null)
        break Fail842;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consListSort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}