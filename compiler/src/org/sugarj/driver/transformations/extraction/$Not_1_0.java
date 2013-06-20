package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail118:
    { 
      IStrategoTerm o_119 = null;
      IStrategoTerm n_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      n_119 = term.getSubterm(0);
      IStrategoList annos90 = term.getAnnotations();
      o_119 = annos90;
      term = a_22.invoke(context, n_119);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}