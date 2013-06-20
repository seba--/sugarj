package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Rule_1_0 extends Strategy 
{ 
  public static $S$Rule_1_0 instance = new $S$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail99:
    { 
      IStrategoTerm a_117 = null;
      IStrategoTerm z_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      z_116 = term.getSubterm(0);
      IStrategoList annos72 = term.getAnnotations();
      a_117 = annos72;
      term = c_21.invoke(context, z_116);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}