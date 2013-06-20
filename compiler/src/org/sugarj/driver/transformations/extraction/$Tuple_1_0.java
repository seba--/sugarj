package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple_1_0 extends Strategy 
{ 
  public static $Tuple_1_0 instance = new $Tuple_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Tuple_1_0");
    Fail164:
    { 
      IStrategoTerm t_127 = null;
      IStrategoTerm s_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      s_127 = term.getSubterm(0);
      IStrategoList annos133 = term.getAnnotations();
      t_127 = annos133;
      term = r_24.invoke(context, s_127);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}