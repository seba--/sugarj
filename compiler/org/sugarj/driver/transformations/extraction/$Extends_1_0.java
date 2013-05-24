package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Extends_1_0 extends Strategy 
{ 
  public static $Extends_1_0 instance = new $Extends_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Extends_1_0");
    Fail830:
    { 
      IStrategoTerm b_436 = null;
      IStrategoTerm a_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExtends_1 != ((IStrategoAppl)term).getConstructor())
        break Fail830;
      a_436 = term.getSubterm(0);
      IStrategoList annos78 = term.getAnnotations();
      b_436 = annos78;
      term = i_338.invoke(context, a_436);
      if(term == null)
        break Fail830;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExtends_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}