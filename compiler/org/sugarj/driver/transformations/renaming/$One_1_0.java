package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $One_1_0 extends Strategy 
{ 
  public static $One_1_0 instance = new $One_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("One_1_0");
    Fail334:
    { 
      IStrategoTerm e_191 = null;
      IStrategoTerm d_191 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOne_1 != ((IStrategoAppl)term).getConstructor())
        break Fail334;
      d_191 = term.getSubterm(0);
      IStrategoList annos280 = term.getAnnotations();
      e_191 = annos280;
      term = n_46.invoke(context, d_191);
      if(term == null)
        break Fail334;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOne_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_191));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}